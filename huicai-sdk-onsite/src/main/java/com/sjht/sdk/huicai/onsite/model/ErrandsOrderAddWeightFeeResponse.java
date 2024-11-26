package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询订单续重加价金额响应参数
 *
 * @author ChenBo
 */
@Data
public class ErrandsOrderAddWeightFeeResponse implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 需要支付的加重费用，单位：分
     */
    private Integer needAddWeightFee;
}
