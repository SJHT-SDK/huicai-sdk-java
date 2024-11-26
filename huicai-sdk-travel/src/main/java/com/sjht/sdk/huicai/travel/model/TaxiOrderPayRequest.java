package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 支付通知
 *
 * @author ChenBo
 */
@Data
public class TaxiOrderPayRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 支付状态 0-支付失败 1-支付成功
     */
    private Integer payStatus;
    /**
     * 支付金额 单位：分
     */
    private Integer payAmount;
}
