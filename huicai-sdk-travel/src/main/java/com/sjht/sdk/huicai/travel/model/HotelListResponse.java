package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取酒店列表
 *
 * @author ChenBo
 */
@Data
public class HotelListResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 酒店ID
     */
    private String hotelId;
    /**
     * 酒店名称
     */
    private String hotelName;
    /**
     * 酒店详细地址
     */
    private String address;
    /**
     * 坐标经度
     */
    private String longitude;
    /**
     * 坐标纬度
     */
    private String latitude;
    /**
     * 距离（单位：米）
     */
    private Integer distance;
    /**
     * 门头照URL地址
     */
    private String coverPicture;
}
