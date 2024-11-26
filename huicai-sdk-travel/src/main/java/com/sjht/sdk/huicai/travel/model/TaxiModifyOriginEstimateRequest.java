package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改起点询价
 *
 * @author ChenBo
 */
@Data
public class TaxiModifyOriginEstimateRequest implements Serializable {

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
    private String startLongitude;
    /**
     * 新起点纬度
     */
    private String startLatitude;
    /**
     * 新起点名称
     */
    private String startName;
    /**
     * 新起点具体地址信息
     */
    private String startAddress;

}
