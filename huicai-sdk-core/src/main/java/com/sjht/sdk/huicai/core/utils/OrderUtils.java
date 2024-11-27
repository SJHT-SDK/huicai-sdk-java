package com.sjht.sdk.huicai.core.utils;

import com.alibaba.fastjson2.JSONObject;

public class OrderUtils {

    /**
     * 校验订单号
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return JSONObject
     */
    public static JSONObject verifyOrderNo(String orderNo, String appOrderNo) {
        if (orderNo == null || orderNo.isEmpty()) {
            throw new RuntimeException("世纪恒通订单号不能为空");
        }
        if (appOrderNo == null || appOrderNo.isEmpty()) {
            throw new RuntimeException("业务系统内部订单号不能为空");
        }
        JSONObject request = new JSONObject();
        request.put("orderNo", orderNo);
        request.put("appOrderNo", appOrderNo);
        return request;
    }
}
