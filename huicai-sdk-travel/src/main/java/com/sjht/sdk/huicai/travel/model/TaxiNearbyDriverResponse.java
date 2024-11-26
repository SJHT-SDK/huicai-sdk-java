package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询附近司机
 *
 * @author ChenBo
 */
@Data
public class TaxiNearbyDriverResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 司机经度
     */
    private String longitude;
    /**
     * 司机纬度
     */
    private String latitude;
    /**
     * 车头朝向角度，顺时针方向，正北为0度
     */
    private String bearing;
    /**
     * 司机位置上传时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String loctime;
    /**
     * 运力类型
     */
    private Integer rideType;
    /**
     * 预估距离，单位：米
     */
    private Integer mileage;
    /**
     * 预计到达时间，单位：秒
     */
    private Integer duration;

}
