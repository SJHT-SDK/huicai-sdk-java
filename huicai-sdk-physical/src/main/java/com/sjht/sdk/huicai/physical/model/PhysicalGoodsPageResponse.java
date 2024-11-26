package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PhysicalGoodsPageResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 品牌ID
     */
    private String brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 分类ID
     */
    private String categoryId;
    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 商品标签描述
     */
    private String goodsLabel;

    /**
     * 是否支持7天无理由退款   0-否  1-是
     */
    private Integer isSupportSevenDaysWithoutReasonRefund;
    /**
     * 虚拟商品类型 1-全网充值券 2-世纪恒通自发券-ETC权益包 3-积分兑换券 4-微信代金券 5-恒通自发券   12-支付宝红包
     */
    private Integer goodsTicketType;
    /**
     * 商品主图URL地址
     */
    private String coverPicture;
    /**
     * 状态  0-下架  1-上架
     */
    private Integer status;

    /**
     * SKU列表
     */
    private List<GoodsSkuOutput> skuList;


    @Data
    public static class GoodsSkuOutput implements Serializable {

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

    }

}
