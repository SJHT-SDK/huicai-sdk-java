package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class MerchantCouponPushData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 核销时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String verifyTime;

    /**
     * 核销商户号
     */
    private String verifyMchNo;

    /**
     * 核销商户名称
     */
    private String verifyMchName;

    /**
     * 核销门店ID
     */
    private String verifyShopId;

    /**
     * 核销门店名称
     */
    private String verifyShopName;
}
