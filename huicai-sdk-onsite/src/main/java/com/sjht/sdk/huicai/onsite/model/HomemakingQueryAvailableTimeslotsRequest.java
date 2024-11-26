package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询可预约时间
 *
 * @author ChenBo
 */
@Data
public class HomemakingQueryAvailableTimeslotsRequest implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 用户手机号码
     */
    private String userMobile;
    /**
     * 世纪恒通SKU ID
     */
    private String skuId;
    /**
     * 坐标纬度
     */
    private String latitude;
    /**
     * 坐标经度
     */
    private String longitude;
    /**
     * 省份区域编码
     */
    private String provinceCode;
    /**
     * 省份名称
     */
    private String provinceName;
    /**
     * 城市区域编码
     */
    private String cityCode;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 区县区域编码
     */
    private String countyCode;
    /**
     * 区县名称
     */
    private String countyName;
    /**
     * 街道/乡镇编码
     */
    private String streetCode;
    /**
     * 街道/乡镇名称
     */
    private String streetName;
    /**
     * 预约时间，格式：yyyy-MM-dd
     */
    private String date;
}
