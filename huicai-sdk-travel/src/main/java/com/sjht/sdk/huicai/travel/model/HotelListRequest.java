package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取酒店列表
 *
 * @author ChenBo
 */
@Data
public class HotelListRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 酒店服务SKU ID，由世纪恒通为业务接入方开通后提供
     */
    private String serviceSkuId;
    /**
     * 当前页码。默认为1
     */
    private Integer pageNum = 1;
    /**
     * 页码大小。默认为10，最大值为50。
     */
    private Integer pageSize = 10;
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
}
