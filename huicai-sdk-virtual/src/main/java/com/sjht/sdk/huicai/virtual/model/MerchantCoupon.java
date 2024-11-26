package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商家券信息
 *
 * @author ChenBo
 */
@Data
public class MerchantCoupon implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 是否允许下单购买 0-否 1-是
     */
    private Integer couponType;
    /**
     * 使用有效期-开始时间
     */
    private Date validityStartTime;
    /**
     * 使用有效期-结束时间
     */
    private Date validityEndTime;

    /**
     * 面额
     */
    private Integer denomination;

    /**
     * 消费门槛
     */
    private Integer consumptionThreshold;

    /**
     * 发放数量
     */
    private Integer distributionQuantity;
    /**
     * 发放数量
     */
    private Integer userLeadNum;
    /**
     * 有效天数
     */
    private Integer validityDay;
}
