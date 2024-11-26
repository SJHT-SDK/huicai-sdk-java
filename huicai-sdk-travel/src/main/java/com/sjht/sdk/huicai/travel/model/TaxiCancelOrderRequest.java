package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 取消订单
 *
 * @author ChenBo
 */
@Data
public class TaxiCancelOrderRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 取消原因
     */
    private Integer cancelCode;
    /**
     * 取消原因，cancelCode为0其它时必填
     */
    private String cancelReason;
}
