package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 订单计费轨迹查询
 *
 * @author ChenBo
 */
@Data
public class TaxiQueryOrderTrackResponse implements Serializable {

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
     * 订单轨迹列表
     */
    private List<TaxiOrderTrack> trackList;
}
