package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单商品回寄
 *
 * @author ChenBo
 */
@Data
public class PhysicalOrderReturnGoodsRequest implements Serializable {
    /**
     * 供应商系统订单号
     */
    private String orderNo;
    /**
     * 业务系统内部订单号
     */
    private String appOrderNo;
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
}
