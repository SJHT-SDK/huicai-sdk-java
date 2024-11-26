package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 酒店订单查询取消/提前离店申请单详情
 *
 * @author ChenBo
 */
@Data
public class HotelQueryOrderRefundAndChangeDetailRequest implements Serializable {

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
     * 申请类型  1-申请取消  2-申请提前离店
     */
    private Integer applyType;
}
