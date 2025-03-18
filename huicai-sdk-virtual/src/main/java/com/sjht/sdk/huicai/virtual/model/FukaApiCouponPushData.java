package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class FukaApiCouponPushData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 绑定用户手机号码
     */
    private String bindMobilePhone;
    /**
     * 绑定时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String bindTime;
}
