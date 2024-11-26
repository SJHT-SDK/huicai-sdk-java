package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询订单取消费用
 *
 * @author ChenBo
 */
@Data
public class ErrandsQueryOrderCancelFeeResponse implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 送回费，单位：分（取件后取消订单，当取消费大于订单实付金额时，会产生送回费，需用户额外支付）
     */
    private Integer sendBackFee;
    /**
     * 扣款金额，单位：分
     */
    private Integer punishAmount;
    /**
     * 扣款金额的解释说明
     * 频繁取消订单，可能会产生取消费。若因跑腿员原因取消，请联系跑腿员操作取消或投诉跑腿员
     */
    private String desc;
}
