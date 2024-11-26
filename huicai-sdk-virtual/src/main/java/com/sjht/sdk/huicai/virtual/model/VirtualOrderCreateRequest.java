package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建虚拟订单请求参数
 *
 * @author ChenBo
 */
@Data
public class VirtualOrderCreateRequest implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 接入方业务系统内部订单号，只能是数字、大小写字母_-*，且在同一个AppId下唯一
     */
    private String appOrderNo;
    /**
     * 用户手机号码
     */
    private String userMobile;
    /**
     * SKU ID
     */
    private String skuId;
    /**
     * 充值账号属性。JSON字符串，示例：{"phone":"13800000000","money":"30000"}
     */
    private RechargeAccount accounts;
    /**
     * 虚拟订单状态回调地址
     */
    private String notifyUrl;
    /**
     * 二级分销ID
     */
    private String distributorsId;
    /**
     * 二级分销名称
     */
    private String distributorsName;

    /**
     * 充值账号
     *
     * @author ChenBo
     */
    @Data
    public static class RechargeAccount implements Serializable {

        private static final long serialVersionUID = -1L;

        /**
         * 充值手机号码
         */
        private String phone;
        /**
         * 微信OpenId
         */
        private String openid;
        /**
         * 腾讯QQ
         */
        private String qq;
        /**
         * 车牌号码
         */
        private String plateNumber;
        /**
         * 购买数量
         */
        private String num;
        /**
         * 充值金额，单位：分
         */
        private String money;
        /**
         * UUID，一般用于一些特殊商品的自定义参数
         */
        private String uid;
    }
}
