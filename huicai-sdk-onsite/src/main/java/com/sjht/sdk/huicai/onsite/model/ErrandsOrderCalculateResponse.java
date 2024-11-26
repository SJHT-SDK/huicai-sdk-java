package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 订单计费
 *
 * @author ChenBo
 */
@Data
public class ErrandsOrderCalculateResponse implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 世纪恒通跑腿订单号
     */
    private String orderNo;
    /**
     * 世纪恒通跑腿订单号orderNo过期时间，单位：秒
     */
    private String expiresIn;
    /**
     * 总距离，单位：米
     */
    private Integer totalDistance;
    /**
     * 总重量，单位：kg
     */
    private Integer totalWeight;
    /**
     * 订单总金额，单位：分
     */
    private Integer totalAmount;
    /**
     * 优惠总金额，单位：分
     */
    private Integer couponAmount;
    /**
     * 用户实际需要支付总金额，单位：分
     */
    private Integer payAmount;
    /**
     * 费用明细列表
     */
    private List<ErrandsOrderFeeResponse> feeList;

}
