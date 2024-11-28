package com.sjht.sdk.huicai.core.service;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.sjht.sdk.huicai.core.config.HuicaiApiConfig;
import com.sjht.sdk.huicai.core.model.EncryptModel;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.utils.SignUtil;
import com.sjht.sdk.huicai.core.utils.ThreeDesUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 荟采开放平台回调通知服务
 *
 * @author ChenBo
 */
public class HuicaiNotifyService {

    private final HuicaiApiConfig config;

    public HuicaiNotifyService(HuicaiApiConfig config) {
        if (config == null) {
            throw new RuntimeException("配置信息不能为空");
        }
        if (config.getEncryptSecretKey() == null || config.getEncryptSecretKey().isEmpty()) {
            throw new RuntimeException("配置信息参数加密秘钥不能为空");
        }
        this.config = config;
    }

    /**
     * 回调通知校验
     *
     * @param input           回调数据
     * @param handleInterface 业务处理接口
     * @return 回调结果
     */
    public <T> EncryptModel notifyVerify(EncryptModel input, HttpServletRequest request, HuicaiCallBackHandleInterface<T> handleInterface, Class<T> tClass) {
        if (config.getAppId() == null || config.getAppId().isEmpty()) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "配置信息AppId不能为空"), this.config.getEncryptSecretKey());
        }
        if (config.getAppSecret() == null || config.getAppSecret().isEmpty()) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "配置信息App秘钥不能为空"), this.config.getEncryptSecretKey());
        }
        if (input == null) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "回调通知消息体为空"), this.config.getEncryptSecretKey());
        }
        String appId = request.getHeader("appId");
        String traceId = request.getHeader("traceId");
        String timestamp = request.getHeader("timestamp");
        String nonceStr = request.getHeader("nonceStr");
        String sign = request.getHeader("sign");
        if (null == appId || appId.isEmpty()) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "请求头appId不能为空"), this.config.getEncryptSecretKey());
        }
        if (!appId.equals(this.config.getAppId())) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "appId错误，请求appId和配置信息appId不一致"), this.config.getEncryptSecretKey());
        }
        if (null == traceId || traceId.isEmpty()) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "请求头traceId不能为空"), this.config.getEncryptSecretKey());
        }
        if (null == timestamp || timestamp.isEmpty()) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "请求头timestamp不能为空"), this.config.getEncryptSecretKey());
        }
        if (null == nonceStr || nonceStr.isEmpty()) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "请求头nonceStr不能为空"), this.config.getEncryptSecretKey());
        }
        if (null == sign || sign.isEmpty()) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "请求头sign不能为空"), this.config.getEncryptSecretKey());
        }
        JSONObject body = JSON.parseObject(JSON.toJSONString(input));
        if (body.get("ciphertext") == null || body.getString("ciphertext").isEmpty()) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(500, "请求密文数据ciphertext不能为空"), this.config.getEncryptSecretKey());
        }
        String ciphertext = body.getString("ciphertext");
        String plaintext;
        try {
            plaintext = ThreeDesUtils.decode(ciphertext, this.config.getEncryptSecretKey());
        } catch (Exception e) {
            return EncryptModel.success(Result.error(500, "请求密文数据解密失败"), this.config.getEncryptSecretKey());
        }
        JSONObject params = JSON.parseObject(plaintext);
        if (!SignUtil.verifySign(params, this.config.getAppId(), traceId, timestamp, nonceStr, this.config.getAppSecret(), sign)) {
            handleInterface.fail();
            return EncryptModel.success(Result.error(401, "回调通知签名校验失败"), this.config.getEncryptSecretKey());
        } else {
            handleInterface.success(JSON.parseObject(params.toJSONString(), tClass));
            return EncryptModel.success(Result.success(), this.config.getEncryptSecretKey());
        }
    }

}
