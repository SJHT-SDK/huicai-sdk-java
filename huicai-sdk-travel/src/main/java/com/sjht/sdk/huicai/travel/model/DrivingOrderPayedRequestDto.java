package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代驾订单支付通知请求参数
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderPayedRequestDto implements Serializable {

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
     * 订单总金额（单位：分）
     */
    private Integer totalFee;
    /**
     * 用户支付金额（单位：分）
     */
    private Integer payFee;
    /**
     * 用户支付时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private String payTime;

    /**
     * 用户支付类型：1代驾费用支付、2取消费用支付
     */
    private Integer payType;
    /**
     * 交易单号
     */
    private String tradeNo;
}
