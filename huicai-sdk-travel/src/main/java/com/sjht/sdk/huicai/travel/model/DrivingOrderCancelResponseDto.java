package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 取消代驾订单返回参数
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderCancelResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单取消结果 1-取消成功 0-取消失败
     */
    private Integer cancelResult;
    /**
     * 枚举类型：
     * ONLINE_PAY : 客户拉起收银台线上收款
     * OFFLINE_PAY : 代驾商户线下收款模式
     * EQUITY_DEDUCT : 权益抵扣取消费用
     * 若订单取消产生取消费用，取消费有客户线上收款、商户线下收款和权益抵扣三种模式。且有以下规则：
     * 1. 客户线上收款模式，订单状态为取消待支付。客户收款成功后，由客户调用代驾SaaS线上支付成功API进行通知；
     * 2. 商户线下收款模式，订单状态为取消待支付。商户收款成功后，由商户调用代驾SaaS商家收款成功接口，代驾SaaS再将结果通过SPI通知给客户；
     * 3. 权益抵扣模式，订单状态直接为取消已支付；
     */
    private String cancelFeePayMode;
    /**
     * 取消产生总费用（单位：分）
     * 如有服务商有取消费场景，请同步返回，当金额为0元时服务商对此订单进行标记为取消，进入终态，不再接受后续更新。如果有取消费金额，会标记为取消待支付，后续为支付流程。
     * 该费用为 取消费用与等候费用之和。
     */
    private Integer totalFee;
    /**
     * 订单取消费用（单位：分）
     * 产生取消费的解释原因之一，本次取消产生的费用。用户可参考此解释原因。
     */
    private Integer cancelFee;
    /**
     * 司机等待费用（单位：分）
     * 该参数有取消费时，产生取消费的解释原因之一，此费用为因司机等候期间的按时计费。用户可参考此解释原因。
     */
    private Integer waitFee;
    /**
     * 司机等候时长（单位：秒）
     */
    private Integer waitTime;
}
