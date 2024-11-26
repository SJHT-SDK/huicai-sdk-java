package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改目的地询价
 *
 * @author ChenBo
 */
@Data
public class TaxiModifyDestEstimateRequest implements Serializable {

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
     * 新起点经度
     */
    private String endLongitude;
    /**
     * 新起点纬度
     */
    private String endLatitude;
    /**
     * 新起点名称
     */
    private String endName;
    /**
     * 新起点具体地址信息
     */
    private String endAddress;
}
