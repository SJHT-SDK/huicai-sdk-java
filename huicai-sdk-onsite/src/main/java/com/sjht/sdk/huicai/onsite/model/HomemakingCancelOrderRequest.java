package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 取消订单
 *
 * @author ChenBo
 */
@Data
public class HomemakingCancelOrderRequest implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 取消原因
     */
    private String remark;
}
