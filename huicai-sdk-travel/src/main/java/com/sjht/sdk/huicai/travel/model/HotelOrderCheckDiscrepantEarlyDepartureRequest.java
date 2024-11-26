package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 酒店订单ID请求参数
 *
 * @author ChenBo
 */
@Data
public class HotelOrderCheckDiscrepantEarlyDepartureRequest implements Serializable {

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
     * 提前离店时间
     */
    private String adjustCheckOutDate;
}
