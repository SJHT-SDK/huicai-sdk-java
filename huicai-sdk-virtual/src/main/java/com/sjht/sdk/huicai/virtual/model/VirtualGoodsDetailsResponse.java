package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class VirtualGoodsDetailsResponse implements Serializable {

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
     * 使用说明
     */
    private String useIllustrate;
    /**
     * 状态  0-下架  1-上架
     */
    private Integer status;

    /**
     * 虚拟商品类型 1-全网充值券 2-世纪恒通自发券 3-积分兑换券 4-微信代金券
     */
    private Integer goodsTicketType;

    /**
     * 充值平台 1-不限 2-android 3-IOS
     */
    private Integer rechargePlatform;

    /**
     * 充值方式 1-直充到账 2-返回卡密 3-话费下单。
     */
    private Integer rechargeType;

    /**
     * 使用有效期类型 1-天数 2-时间段 3-天数+时间段 4-不限
     */
    private String useExpireType;
    /**
     * 有效期天数
     */
    private String useExpireDays;
    /**
     * 使用有效期开始时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private String beginDate;
    /**
     * 使用有效期结束时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private String endDate;

    /**
     * SKU列表
     */
    private List<GoodsSkuOutput> skuList;


    /**
     * 商品图册列表
     */
    private List<PhotoAlbum> photoAlbumList;
    /**
     * 商品图册列表
     */
    private String cardPasswordReturnType;
    /**
     * 权益包ID
     */
    private String packageId;
    /**
     * 权益包名称
     */
    private String packageName;
    /**
     * 每期天数
     */
    private String daysPerMonth;
    /**
     * 发放方式 1-手动领取 2-自动发放。
     */
    private String sendMode;
    /**
     * 营销内容。
     */
    private String marketingMsg;
    /**
     * 消耗积分类型 1-移动积分 2-联通积分 3-电信积分。
     * 商品类型为积分兑换券时返回
     */
    private String pointsType;
    /**
     * 积分消耗结算比率 0.56表示56%。
     * 商品类型为积分兑换券时返回
     */
    private String pointsSettlementRate;
    /**
     * 兑换积分基数
     * 商品类型为积分兑换券时返回
     */
    private Integer pointsTypeBase;
    /**
     * 兑换积分基数。
     * 商品类型为积分兑换券时返回
     */
    private Integer pointsExchangeBase;


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
         * 充值参数。多个时使用,号分割
         * phone：手机号码
         * money:充值金额（单位：分）
         * openid：微信OpenId
         * qq：腾讯QQ
         * num：购买数量
         * uid：UUID，一般用于一些特殊商品的自定义参数
         */
        private String rechargeAccounts;
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

}
