package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 酒店订单退改签申请请求参数
 *
 * @author ChenBo
 */
@Data
public class HotelOrderRefundAndChangeRevocationRequest implements Serializable {

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
    /**
     * 撤销原因
     */
    private String cancelReason;
}
