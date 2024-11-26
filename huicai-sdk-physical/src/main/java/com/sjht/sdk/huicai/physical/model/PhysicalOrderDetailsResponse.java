package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 实物订单详情
 *
 * @author ChenBo
 */
@Data
public class PhysicalOrderDetailsResponse implements Serializable {
    /**
     * 供应商系统订单号
     */
    private String orderNo;
    /**
     * 业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 用户手机号码
     */
    private String userMobile;
    /**
     * 订单商品总数量
     */
    private Integer goodsCount;
    /**
     * 支付平台交易ID
     */
    private String transactionId;
    /**
     * 客户结算总金额，单位：分
     */
    private Integer settlementAmount;
    /**
     * 订单状态 0-待支付 1-待发货  2-已发货  10-已完成  20-已取消
     */
    private Integer orderStatus;
    /**
     * 退款状态 0-未退款 1-待处理 10-退款中 11-待退款 20-已退款 30-退款失败 40-驳回申请 50-拒绝退款
     */
    private Integer refundStatus;
    /**
     * 开票状态  0-未申请  1-待开票  2-已开票
     */
    private Integer billStatus;
    /**
     * 物流状态  0-在途  1-揽收  2-疑难  3-签收  4-退签  5-派件  6-退回  7-转投  8-清关  14-拒签  15-等待退回
     */
    private Integer shippingStatus;
    /**
     * 支付方式  1-现金 2-卡券 3-积分 4-福利金 5-现金+卡券 6-现金+积分 7-现金+福利金 8-卡券+积分 9-卡券+福利金 10-积分+福利金
     */
    private Integer payWay;
    /**
     * 支付平台  1-微信支付  2-支付宝  3-其它
     */
    private Integer payPlatform;
    /**
     * 订单创建生成时间, 时间格式 2023-03-23 14:20:18
     */
    private String orderCreateTime;
    /**
     * 订单支付时间, 时间格式 2023-03-23 14:20:18
     */
    private String orderPayTime;
    /**
     * 订单发货时间, 时间格式 2023-03-23 14:20:18
     */
    private String deliveryTime;
    /**
     * 订单签收时间, 时间格式 2023-03-23 14:20:18
     */
    private String receiptTime;
    /**
     * 订单取消时间, 时间格式 2023-03-23 14:20:18
     */
    private String orderCancelTime;
    /**
     * 售后申请时间, 时间格式 2023-03-23 14:20:18
     */
    private String orderAfterSalesApplyTime;
    /**
     * 客户名称
     */
    private String appName;
    /**
     * 客户所属商户ID
     */
    private String appMchId;
    /**
     * 客户所属商户名称
     */
    private String appMchName;
    /**
     * 客户所属机构
     */
    private String appOrgName;
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
     * 订单商品列表
     */
    private List<OrderGoods> goodsList;
    /**
     * 订单物流信息。订单已发货或订单退回时返回
     */
    private List<OrderShipping> shippingAddress;
    /**
     * 订单退款信息。订单取消完成退款时返回
     */
    private OrderRefund refundInfo;

    @Data
    public static class OrderGoods implements Serializable {
        /**
         * skuId
         */
        private String skuId;
        /**
         * sku名称
         */
        private String skuName;
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
        private Integer number;
        /**
         * 客户结算价，单位：分
         */
        private Integer settlementPrice;
    }

    @Data
    public static class OrderShipping implements Serializable {
        /**
         * 物流类型 0-用户购买收货地址 1-用户退货寄件地址
         */
        private Integer shippingType;
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
         * 详细地址
         */
        private String address;
        /**
         * 邮政编码
         */
        private String postCode;
        /**
         * 物流公司名称
         */
        private String expressCompanyName;
        /**
         * 物流公司编码
         */
        private String expressCompanyCode;
        /**
         * 物流单号
         */
        private String expressNumber;
        /**
         * 订单物流列表信息
         */
        private List<ShippingDetails> shippingList;
    }

    @Data
    public static class ShippingDetails implements Serializable {
        /**
         * 时间，物流公司原始格式
         */
        private String primevalTime;
        /**
         * 格式化后时间
         */
        private String formatTime;
        /**
         * 物流基础状态，具体的值查看快递100的API文档
         */
        private String basicStatusCode;
        /**
         * 物流基础状态值描述，具体的值查看快递100的API文档
         */
        private String basicStatusDescribe;
        /**
         * 物流高级状态，具体的值查看快递100的API文档
         */
        private String advancedStatusCode;
        /**
         * 物流高级状态值描述，具体的值查看快递100的API文档
         */
        private String advancedStatusDescribe;
        /**
         * 物流内容描述
         */
        private String context;
        /**
         * 行政区域编码
         */
        private String areaCode;
        /**
         * 行政区域名称
         */
        private String areaName;
        /**
         * 物流经纬度
         */
        private String arelongitudeLatitudeaName;
    }

    @Data
    public static class OrderRefund implements Serializable {
        /**
         * 退款发起方 1-业务端发起退款 2-供应商后台发起退款
         */
        private Integer refundInitiator;
        /**
         * 业务系统退款单号
         */
        private String appRefundNo;
        /**
         * 支付平台退款交易ID
         */
        private String payRefundTransactionId;
        /**
         * 退款金额，单位：分
         */
        private Integer refundAmount;
        /**
         * 申请退款时间，格式：yyyy-MM-dd HH:mm:ss
         */
        private String refundApplyTime;
        /**
         * 退款同意申请或拒绝驳回时间，格式：yyyy-MM-dd HH:mm:ss
         */
        private String refundDealWithApplyTime;
        /**
         * 退款成功时间，格式：yyyy-MM-dd HH:mm:ss
         */
        private String refundSucceedTime;
        /**
         * 退款原因/退款理由
         */
        private String refundCause;
        /**
         * 退款补充描述
         */
        private String refundSupplementDescription;
        /**
         * 退款驳回/拒绝原因
         */
        private String refundRejectCause;
        /**
         * 订单退款凭证图片
         */
        private List<RefundEvidence> refundEvidenceImages;
    }

    @Data
    public static class RefundEvidence implements Serializable {
        /**
         * 订单退款凭证图片URL地址
         */
        private String imageUrl;
    }
}
