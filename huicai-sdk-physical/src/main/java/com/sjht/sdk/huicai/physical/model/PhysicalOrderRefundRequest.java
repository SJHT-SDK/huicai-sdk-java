package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 退款申请
 *
 * @author ChenBo
 */
@Data
public class PhysicalOrderRefundRequest implements Serializable {
    /**
     * 供应商系统订单号
     */
    private String orderNo;
    /**
     * 业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 售后类型 1-退货退款 2-仅退款
     */
    private Integer afterSaleType;
    /**
     * 订单总金额，单位：分
     */
    private Integer totalAmount;
    /**
     * 退款总金额，单位：分
     */
    private Integer refundAmount;
    /**
     * 业务系统退款单号，只能是数字、大小写字母_-*且在同一个AppId下唯一
     */
    private String appRefundNo;
    /**
     * 退款申请时间，格式：yyy-MM-dd HH:mm:ss
     * y
     */
    private String refundApplyTime;
    /**
     * 退款原因/退款理由
     */
    private String refundCause;
    /**
     * 退款补充描述
     */
    private String refundSupplementDescription;
    /**
     * 订单退款凭证图片
     */
    private List<RefundEvidence> refundEvidenceImages;

    @Data
    public static class RefundEvidence implements Serializable {
        /**
         * 订单退款凭证图片Url地址
         */
        private String imageUrl;
    }
}
