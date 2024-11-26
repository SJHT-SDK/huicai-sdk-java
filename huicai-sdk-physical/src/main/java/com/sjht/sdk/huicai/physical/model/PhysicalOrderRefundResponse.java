package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 退款申请
 *
 * @author ChenBo
 */
@Data
public class PhysicalOrderRefundResponse implements Serializable {
    /**
     * 供应商系统订单号
     */
    private String orderNo;
    /**
     * 供应商系统退款单号
     */
    private String refundNo;
    /**
     * 业务系统退款单号
     */
    private String appRefundNo;
}
