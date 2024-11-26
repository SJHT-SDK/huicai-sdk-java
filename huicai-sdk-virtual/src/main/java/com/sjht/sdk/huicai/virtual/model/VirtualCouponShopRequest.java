package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 根据SKU ID分页查询商家自发券适用门店
 *
 * @author ChenBo
 */
@Data
public class VirtualCouponShopRequest implements Serializable {

    private static final long serialVersionUID = 1L;

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
    /**
     * 商品Sku Id
     */
    private String skuId;
}
