package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取司机实时位置
 *
 * @author ChenBo
 */
@Data
public class TaxiDriverLocationResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 司机实时位置经度
     */
    private String longitude;
    /**
     * 司机实时位置纬度
     */
    private String latitude;
    /**
     * 车头朝向角度，正北为0度
     */
    private String bearing;
}
