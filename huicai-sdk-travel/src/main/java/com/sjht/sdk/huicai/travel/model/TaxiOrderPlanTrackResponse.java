package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 司机规划接驾、送驾路线查询
 *
 * @author ChenBo
 */
@Data
public class TaxiOrderPlanTrackResponse implements Serializable {

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
     * 总里程 单位：米
     */
    private Integer mileage;
    /**
     * 总时长 单位：秒
     */
    private Integer duration;
    /**
     * 有效点位集合 例：114.456,34.123;114.456,34.123;
     */
    private String coords;
    /**
     * 总时长 单位：秒
     */
    private String createTime;


}
