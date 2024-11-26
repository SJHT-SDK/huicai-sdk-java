package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 酒店订单退改签申请请求参数
 *
 * @author ChenBo
 */
@Data
public class HotelOrderRefundAndChangeApplyRequest implements Serializable {

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
     * 申请类型  1-超时取消  2-提前离店
     */
    private Integer applyType;
    /**
     * 申请原因
     */
    private String applyReason;
    /**
     * 申请退房日期（申请类型为2时必填）
     */
    private String adjustCheckOutDate;
    /**
     * 操作类型 1-申请 2-撤销
     */
    private Integer operationType;
}
