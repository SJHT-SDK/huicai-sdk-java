package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建实物订单
 *
 * @author ChenBo
 */
@Data
public class PhysicalOrderCreateRequest implements Serializable {
    /**
     * 业务系统内部订单号，只能是数字、大小写字母_-*且在同一个AppId下唯一
     */
    private String appOrderNo;
    /**
     * 用户手机号
     */
    private String userMobile;
    /**
     * 支付平台交易ID
     */
    private String transactionId;
    /**
     * 订单总金额，单位：分
     */
    private Integer totalAmount;
    /**
     * 实付总金额，单位：分
     */
    private Integer actualPaymentAmount;
    /**
     * 福利金总金额，单位：分
     */
    private Integer welfareAmount;
    /**
     * 优惠券抵扣总金额，单位：分
     */
    private Integer couponAmount;
    /**
     * 支付方式（1-现金 2-卡券 3-积分 4-福利金 5-现金+卡券 6-现金+积分 7-现金+福利金 8-卡券+积分 9-卡券+福利金 10-积分+福利金）
     */
    private Integer payWay;
    /**
     * 支付平台（1-微信支付 2-支付宝 3-福利金平台 4-其它）
     */
    private Integer payPlatform;
    /**
     * 订单创建时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String orderCreateTime;
    /**
     * 订单支付时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String orderPayTime;
    /**
     * 订单状态变更通知地址，接口规则及要求请查阅2.3订单状态推送通知
     */
    private String notifyUrl;
    /**
     * 客户所属商户ID
     */
    private String appMchId;
    /**
     * 客户所属商户名称
     */
    private String appMchName;
    /**
     * 客户活动名称
     */
    private String appActivityName;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户编号
     */
    private String userNo;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 二级分销ID
     */
    private String distributorsId;
    /**
     * 二级分销名称
     */
    private String distributorsName;
    /**
     * 商品列表，同一笔订单商品数量最大限制为[100]条
     */
    private List<OrderGoods> goodsList;
    /**
     * 物流配送地址
     */
    private OrderShippingAddress shippingAddress;

    /**
     * 订单商品
     */
    @Data
    public static class OrderGoods implements Serializable {
        /**
         * skuId
         */
        private String skuId;
        /**
         * 下单数量
         */
        private Integer number;

        //region 历史版本
        /**
         * 商品ID
         */
        private String goodsId;
        /**
         * 商品名称
         */
        private String goodsName;
        /**
         * 下单数量
         */
        private Integer goodsNumber;
        /**
         * 原价/成本价/市场价/采购价，单位：分
         */
        private Integer costPrice;
        /**
         * 销售价，单位：分
         */
        private Integer salesPrice;
        /**
         * 客户结算价，单位：分
         */
        private Integer settlementPrice;
        //endregion
    }

    /**
     * 订单物流地址
     */
    @Data
    public static class OrderShippingAddress implements Serializable {
        /**
         * 收件人姓名
         */
        private String consigneeName;
        /**
         * 收件人手机号码
         */
        private String consigneeMobilePhone;
        /**
         * 省份名称
         */
        private String province;
        /**
         * 城市名称
         */
        private String city;
        /**
         * 区县名称
         */
        private String county;
        /**
         * 详细地址，不包含省市县
         */
        private String address;
        /**
         * 邮政编码
         */
        private String postCode;
    }
}
