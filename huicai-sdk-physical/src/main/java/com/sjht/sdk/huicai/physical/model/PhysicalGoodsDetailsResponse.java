package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PhysicalGoodsDetailsResponse implements Serializable {

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
     * 品牌信息
     */
    private BrandOutput brand;
    /**
     * 分类ID
     */
    private String categoryId;
    /**
     * 分类信息
     */
    private List<CategoryOutput> category;

    /**
     * 商品标签描述
     */
    private String goodsLabel;

    /**
     * 是否支持7天无理由退款   0-否  1-是
     */
    private Integer isSupportSevenDaysWithoutReasonRefund;
    /**
     * 商品主图URL地址
     */
    private String coverPicture;

    /**
     * 商品详情
     */
    private String content;
    /**
     * 状态  0-下架  1-上架
     */
    private Integer status;

    /**
     * 退款说明
     */
    private String refundInstructions;

    /**
     * SKU列表
     */
    private List<GoodsSkuOutput> skuList;


    /**
     * 商品图册列表
     */
    private List<PhotoAlbum> photoAlbumList;

    /**
     * 属性列表
     */
    private List<Attribute> attributeList;


    @Data
    public static class GoodsSkuOutput implements Serializable {

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

    }

    @Data
    public static class BrandOutput implements Serializable {

        /**
         * 品牌ID
         */
        private String brandId;
        /**
         * 品牌名称
         */
        private String brandName;
        /**
         * 品牌LOGO
         */
        private String brandLogo;
        /**
         * 品牌介绍
         */
        private String describes;

    }

    @Data
    public static class CategoryOutput implements Serializable {

        /**
         * 分类ID
         */
        private String categoryId;
        /**
         * 分类名称
         */
        private String categoryName;
        /**
         * 父级ID
         */
        private String parentId;
    }

    @Data
    public static class PhotoAlbum implements Serializable {

        /**
         * 文件类型 0-图片 1-视频
         */
        private String fileType;
        /**
         * 文件URL地址
         */
        private String fileUrl;
        /**
         * 图册介绍
         */
        private String intro;
    }

    @Data
    public static class Attribute implements Serializable {

        /**
         * 属性名称
         */
        private String attributeName;
        /**
         * 分类名称
         */
        private String attributeValue;
        /**
         * 显示位置 1-商品详情顶部 2-商品详情底部
         */
        private String showLocation;
        /**
         * 排序
         */
        private Integer sort;
    }


}
