package com.sjht.sdk.huicai.core.client;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.sjht.sdk.huicai.core.config.HuicaiApiConfig;
import com.sjht.sdk.huicai.core.constant.Constants;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.utils.SignUtil;
import com.sjht.sdk.huicai.core.utils.ThreeDesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 荟采API客户端
 *
 * @author ChenBo
 */
public abstract class HuicaiApiClient {
    Logger logger = LoggerFactory.getLogger(HuicaiApiClient.class);

    private final HuicaiApiConfig config;

    /**
     * 初始化API配置
     *
     * @param config API配置
     */
    public HuicaiApiClient(HuicaiApiConfig config) {
        Objects.requireNonNull(config);
        if (config.getServerUrl() == null || config.getServerUrl().isEmpty()) {
            config.setServerUrl(Constants.PRO_SERVER_URL);
        }
        if (config.getAppId() == null || config.getAppId().isEmpty()) {
            throw new RuntimeException("AppId不能为空");
        }
        if (config.getAppSecret() == null || config.getAppSecret().isEmpty()) {
            throw new RuntimeException("App秘钥不能为空");
        }
        if (config.getEncryptSecretKey() == null || config.getEncryptSecretKey().isEmpty()) {
            throw new RuntimeException("参数加密秘钥不能为空");
        }
        if (config.getLogWitch() == null) {
            config.setLogWitch(false);
        }
        this.config = config;
    }

    /**
     * 进行请求签名并设置请求头
     *
     * @param body 发送请求Body
     * @return 请求头
     */
    private Map<String, String> getApiAuthHeader(JSONObject body) {
        String traceId = IdUtil.fastSimpleUUID();
        String timestamp = String.valueOf(System.currentTimeMillis());
        String nonceStr = RandomUtil.randomString(10);
        Map<String, String> header = new HashMap<>();
        header.put("appId", this.config.getAppId());
        header.put("traceId", traceId);
        header.put("timestamp", timestamp);
        header.put("nonceStr", nonceStr);
        String sign = SignUtil.getParamsSign(body, this.config.getAppId(), traceId, timestamp, nonceStr, config.getAppSecret());
        header.put("sign", sign);
        return header;
    }

    /**
     * 解密请求响应数据
     *
     * @param ciphertext 密文
     * @return 明文
     */
    private String decryptResponseData(String ciphertext) {
        try {
            return ThreeDesUtils.decode(ciphertext, this.config.getEncryptSecretKey());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 执行请求操作
     *
     * @param apiUrl API
     * @param input  请求参数
     * @param <E>    请求对象
     * @return 响应数据
     */
    private <E> JSONObject execute(String apiUrl, E input) {
        StringBuilder logText = new StringBuilder("荟采开放平台API请求");
        try {
            JSONObject data = JSON.parseObject(JSON.toJSONString(input));
            Map<String, String> headersMap = getApiAuthHeader(data);
            String requestCiphertext;
            try {
                requestCiphertext = ThreeDesUtils.encode(data.toJSONString(), this.config.getEncryptSecretKey());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            JSONObject encryptJsonParams = new JSONObject();
            encryptJsonParams.put("ciphertext", requestCiphertext);
            String serverUrl = this.config.getServerUrl().replace(".com/", ".com");
            String route;
            if (apiUrl.contains("/open/")) {
                route = Constants.HUI_CAI_API_ROUTE;
            } else if (serverUrl.startsWith(Constants.PRO_SERVER_URL)) {
                route = Constants.PRO_ROUTE;
            } else if (serverUrl.startsWith(Constants.DEV_SERVER_URL)) {
                route = Constants.DEV_ROUTE;
            } else {
                route = "";
            }

            String sendApiUrl = serverUrl + route + apiUrl;
            logText.append("\n请求URL：").append(sendApiUrl);
            logText.append("\n请求头Headers：").append(JSON.toJSONString(headersMap));
            logText.append("\n请求体Body明文：").append(data.toJSONString());
            logText.append("\n请求体Body密文：").append(encryptJsonParams.toJSONString());
            long startTime = System.currentTimeMillis();
            HttpResponse response = HttpRequest.post(sendApiUrl)
                    .headerMap(headersMap, false)
                    .body(encryptJsonParams.toJSONString(), "application/json")
                    .execute();
            long endTime = System.currentTimeMillis();
            logText.append("\n请求耗时：").append(endTime - startTime).append("毫秒");
            if (response == null || response.body() == null || "".equals(response.body())) {
                throw new RuntimeException("请求异常，发送的请求未返回响应数据");
            }
            logText.append("\n响应Body数据：").append(response.body());
            JSONObject jsonCiphertextResult = JSON.parseObject(response.body());
            if (jsonCiphertextResult.get(Constants.CODE) != null) {
                JSONObject result = new JSONObject();
                result.put(Constants.CODE, jsonCiphertextResult.getInteger(Constants.CODE));
                result.put(Constants.MSG, jsonCiphertextResult.get(Constants.MSG) != null ? jsonCiphertextResult.getString(Constants.MSG) : "未知异常，请稍后重试");
                if (jsonCiphertextResult.get(Constants.DATA) != null) {
                    result.put(Constants.DATA, jsonCiphertextResult.get(Constants.DATA));
                }

                return result;
            }
            if (jsonCiphertextResult.get("ciphertext") == null) {
                throw new RuntimeException("接口未返回响应加密数据");
            }
            String plaintext = this.decryptResponseData(jsonCiphertextResult.getString("ciphertext"));
            JSONObject result = JSON.parseObject(plaintext);
            if (result.get(Constants.CODE) == null) {
                throw new RuntimeException("返回状态码异常");
            }
            logText.append("\n响应Body密文解密明文数据：").append(result.toJSONString());
            return result;
        } finally {
            if (this.config.getLogWitch()) {
                logger.info(logText.toString());
            }
        }
    }

    /**
     * 执行请求操作
     *
     * @param apiUrl API地址
     * @param input  请求Body
     * @param tClass 响应对象
     * @param <T>    响应对象
     * @param <E>    请求对象
     * @return 响应内容
     */
    public <T, E> Result<T> execute(String apiUrl, E input, Class<T> tClass) {
        JSONObject jsonResult = this.execute(apiUrl, input);
        Result<T> result = new Result<>();
        result.setCode(jsonResult.getInteger(Constants.CODE));
        result.setMsg(jsonResult.getString(Constants.MSG));
        if (jsonResult.get(Constants.DATA) != null) {
            result.setData(JSON.parseObject(jsonResult.getString(Constants.DATA), tClass));
        }
        return result;
    }

    /**
     * 执行请求操作
     *
     * @param apiUrl API地址
     * @param input  请求Body
     * @param tClass 响应对象
     * @param <T>    响应对象
     * @param <E>    请求对象
     * @return 响应内容
     */
    public <T, E> Result<T> execute(ApiUrl apiUrl, E input, Class<T> tClass) {
        return this.execute(apiUrl.getApiUrl(), input, tClass);
    }

    /**
     * 执行请求操作
     *
     * @param apiUrl API地址
     * @param input  请求Body
     * @param tClass 响应对象
     * @param <T>    响应对象
     * @param <E>    请求对象
     * @return 响应内容
     */
    public <T, E> Result<List<T>> executeToList(String apiUrl, E input, Class<T> tClass) {
        JSONObject jsonResult = this.execute(apiUrl, input);
        //返回结果
        Result<List<T>> result = new Result<>();
        result.setCode(jsonResult.getInteger(Constants.CODE));
        result.setMsg(jsonResult.getString(Constants.MSG));
        if (jsonResult.get(Constants.DATA) != null) {
            result.setData(JSON.parseArray(jsonResult.getString(Constants.DATA), tClass));
        }
        if (jsonResult.get(Constants.TOTAL) != null) {
            result.setTotal(jsonResult.getLong(Constants.TOTAL));
        }
        return result;
    }

    /**
     * 执行请求操作
     *
     * @param apiUrl API地址
     * @param input  请求Body
     * @param tClass 响应对象
     * @param <T>    响应对象
     * @param <E>    请求对象
     * @return 响应内容
     */
    public <T, E> Result<List<T>> executeToList(ApiUrl apiUrl, E input, Class<T> tClass) {
        return this.executeToList(apiUrl.getApiUrl(), input, tClass);
    }

}
