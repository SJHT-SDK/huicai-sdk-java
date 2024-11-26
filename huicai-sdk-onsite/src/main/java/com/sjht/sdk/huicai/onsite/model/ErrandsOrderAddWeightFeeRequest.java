package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询订单续重加价金额请求参数
 *
 * @author ChenBo
 */
@Data
public class ErrandsOrderAddWeightFeeRequest implements Serializable {

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
     * 续重重量，单位：kg，向上取整整数，最大重量不超过50kg，例如：6.7kg传7；
     */
    private Integer weight;
}
