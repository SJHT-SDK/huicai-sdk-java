package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 跑腿服务创建订单请求参数
 *
 * @author ChenBo
 */
@Data
public class ErrandsCreateOrderRequest implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 世纪恒通跑腿订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号，只能是数字、大小写字母_-*，且在同一个AppId下唯一
     */
    private String appOrderNo;
    /**
     * 订单状态变更回调通知地址
     */
    private String notifyUrl;
    /**
     * 订单备注
     */
    private String remark;
    /**
     * 扩展透传数据，订单查询接口以及订单推送接口将会原样返回
     */
    private String expandData;
    /**
     * 二级分销ID
     */
    private String distributorsId;
    /**
     * 二级分销名称
     */
    private String distributorsName;
}
