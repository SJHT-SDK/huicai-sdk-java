package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 司机规划接驾、送驾路线查询
 *
 * @author ChenBo
 */
@Data
public class TaxiOrderPlanTrackRequest implements Serializable {

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
     * 类型 1：接驾 2：送驾
     * 不传按照订单状态返回规划路线
     */
    private Integer trackType;
}
