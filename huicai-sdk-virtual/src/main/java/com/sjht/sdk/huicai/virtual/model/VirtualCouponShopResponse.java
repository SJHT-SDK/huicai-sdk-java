package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 根据SKU ID分页查询商家自发券适用门店
 *
 * @author ChenBo
 */
@Data
public class VirtualCouponShopResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商户ID
     */
    private String merchantId;
    /**
     * 商户名称
     */
    private String merchantName;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 门店ID
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 省份编码
     */
    private String province;
    /**
     * 城市编码
     */
    private String city;
    /**
     * 区县编码
     */
    private String district;
    /**
     * 门店详细地址
     */
    private String address;
    /**
     * 门店坐标经度
     */
    private String longitude;
    /**
     * 门店坐标纬度
     */
    private String latitude;
    /**
     * 距离（单位：米）
     */
    private Integer distance;
    /**
     * 门店门头照URL地址
     */
    private String coverPicture;
    /**
     * 营业开始时间，格式：HH:mm
     */
    private String businessStartTime;

    /**
     * 营业结束时间，格式：HH:mm
     */
    private String businessEndTime;
    /**
     * 客服电话
     */
    private String customerServicePhone;
}
