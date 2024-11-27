package com.sjht.sdk.huicai.core.utils;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;

import java.util.*;

/**
 * 签名工具类
 *
 * @author ChenBo
 */
public class SignUtil {

    private SignUtil() {
    }

    /**
     * 所有的请求参数都会在这里进行排序加密
     *
     * @param params    请求Body参数
     * @param appId     AppId
     * @param traceId   32位全局事务ID
     * @param timestamp 时间戳
     * @param nonce     10随机字符串
     * @param appSecret AppSecret
     * @return 供应商系统签名
     */
    public static String getParamsSign(JSONObject params, String appId, String traceId, String timestamp, String nonce, String appSecret) {
        params.remove("sign");
        StringBuilder waitingMd5Params = new StringBuilder();
        SortedMap<String, Object> treeMap = sortMapByKey(params);
        for (Map.Entry<String, Object> entry : treeMap.entrySet()) {
            waitingMd5Params.append(entry.getKey()).append(entry.getValue());
        }
        String paramsStr = waitingMd5Params.toString().replaceAll("\\s*", "");
        String result = (appId + traceId + timestamp + nonce + paramsStr + appSecret);
        return Md5Utils.hash(result);
    }

    /**
     * JSON转顺序排序的Map
     *
     * @param json 原始json
     * @return 响应的map
     */
    public static SortedMap<String, Object> sortMapByKey(JSONObject json) {
        SortedMap<String, Object> treeMap = new TreeMap<>();
        Iterator<String> keys = json.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = json.get(key);
            //判断传入kay-value中是否含有""或null
            if (json.get(key) == null || value == null || value.toString().isEmpty() || value.equals("null")) {
                //当JSON字符串存在null时,不将该kay-value放入Map中,即显示的结果不包括该kay-value
                continue;
            }
            // 判断是否为数组对象
            if (value instanceof Collection) {
                JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(value));
                List<Object> arrayList = new ArrayList<>();
                for (Object object : jsonArray) {
                    // 判断是否为JSONObject，如果是 转化成TreeMap
                    if (object instanceof JSONObject) {
                        object = sortMapByKey(JSON.parseObject(object.toString()));
                    }
                    arrayList.add(object);
                }
                treeMap.put(key, arrayList);
            } else {
                //判断该JSON中是否嵌套JSON
                boolean flag = isJsonValid(value.toString());
                if (flag) {
                    //若嵌套json了,通过递归再对嵌套的json(即子json)进行排序
                    value = sortMapByKey(JSON.parseObject(value.toString()));
                }
                // 其他基础类型直接放入treeMap
                // JSONObject可进行再次解析转换
                treeMap.put(key, value);
            }
        }
        return treeMap;
    }

    /**
     * 校验是否是JSON字符串
     *
     * @param json 传入数据
     * @return 是JSON返回true, 否则false
     */
    private static boolean isJsonValid(String json) {
        if ("undefined".equals(json)) {
            return false;
        }
        try {
            JSON.parseObject(json);
        } catch (JSONException ex) {
            return false;
        }
        return true;
    }

}