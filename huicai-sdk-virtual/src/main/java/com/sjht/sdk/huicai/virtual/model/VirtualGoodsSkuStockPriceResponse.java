package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class VirtualGoodsSkuStockPriceResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * SKU ID
     */
    private String skuId;
    /**
     * SKU名称
     */
    private String skuName;
    /**
     * 参考销售价（单位：分）
     */
    private Integer salesPrice;
    /**
     * 客户结算价（单位：分）
     */
    private Integer settlePrice;
    /**
     * 库存数量
     */
    private Integer stockNum;
    /**
     * SKU封面图片URL地址
     */
    private String coverPicture;
    /**
     * 是否是预售 0-否，1-是
     */
    private Integer isPreSale;
    /**
     * 状态  0-下架  1-上架
     */
    private Integer status;
    /**
     * 是否允许下单购买 0-否 1-是
     */
    private Integer isBuy;
    /**
     * 充值参数
     */
    private String rechargeAccounts;
    /**
     * 是否允许下单购买 0-否 1-是
     */
    private MerchantCoupon merchantCoupon;

}
