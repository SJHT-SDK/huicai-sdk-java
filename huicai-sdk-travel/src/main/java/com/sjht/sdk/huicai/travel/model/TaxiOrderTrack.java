package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 计费轨迹
 *
 * @author ChenBo
 */
@Data
public class TaxiOrderTrack implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 轨迹点经度
     */
    private String longitude;
    /**
     * 轨迹点纬度
     */
    private String latitude;
    /**
     * 轨迹点对应的时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String locateTime;
}
