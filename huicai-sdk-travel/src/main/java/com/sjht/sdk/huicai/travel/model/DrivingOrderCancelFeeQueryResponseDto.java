package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代驾订单查询返回参数
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderCancelFeeQueryResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 取消产生总费用（单位：分）。
     * 当金额为0时恒通侧将对此订单进行标记为已取消，进入终态，不再接受后续更新。如果有取消费金额，会标记为取消待支付，后续为支付流程。
     * 该费用为 取消费用与等候费用之和。
     */
    private Integer totalFee;

    /**
     * 订单取消费用（单位：分）
     */
    private Integer cancelFee;

    /**
     * 司机等待费用（单位：分）
     */
    private Integer waitFee;

    /**
     * 司机就位后等候时长；单位：秒
     */
    private Integer waitTime;

}
