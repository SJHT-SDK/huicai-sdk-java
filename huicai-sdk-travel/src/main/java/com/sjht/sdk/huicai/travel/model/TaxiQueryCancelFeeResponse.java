package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 获取订单取消费用
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxiQueryCancelFeeResponse implements Serializable {

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
     * 需要支付的取消费金额，无取消费返回0，单位：分
     */
    private Integer cancelFee;
}
