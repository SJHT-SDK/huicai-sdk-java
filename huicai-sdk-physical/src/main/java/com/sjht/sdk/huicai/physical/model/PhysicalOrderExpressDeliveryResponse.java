package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 订单物流查询
 *
 * @author ChenBo
 */
@Data
public class PhysicalOrderExpressDeliveryResponse implements Serializable {
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
    private List<OrderShipping> shippingList;

    @Data
    public static class OrderShipping implements Serializable {
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
}
