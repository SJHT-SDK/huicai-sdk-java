package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 家政服务创建订单请求参数
 *
 * @author ChenBo
 */
@Data
public class HomemakingCreateOrderRequest implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 接入方业务系统内部订单号，只能是数字、大小写字母_-*，且在同一个AppId下唯一
     */
    private String appOrderNo;
    /**
     * 世纪恒通SKU ID
     */
    private String skuId;
    /**
     * 订单总金额，单位：分
     */
    private Integer totalAmount;
    /**
     * 订单支付金额，单位：分
     */
    private Integer payAmount;
    /**
     * 订单状态变更回调通知地址
     */
    private String notifyUrl;
    /**
     * 坐标纬度
     */
    private String latitude;
    /**
     * 坐标经度
     */
    private String longitude;
    /**
     * 省份编码
     */
    private String provinceCode;
    /**
     * 省份名称
     */
    private String provinceName;
    /**
     * 城市名称
     */
    private String cityCode;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 区县编码
     */
    private String countyCode;
    /**
     * 区县名称
     */
    private String countyName;
    /**
     * 街道/乡镇编码
     */
    private String streetCode;
    /**
     * 街道/乡镇名称
     */
    private String streetName;
    /**
     * 服务地址，门牌号等详细地址
     */
    private String address;
    /**
     * 地址类型 1:家庭 2:公司
     * 默认为1
     */
    private Integer addressType;
    /**
     * 预约时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String bookingTime;
    /**
     * 用户手机号码
     */
    private String userMobile;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 性别 1-男 2-女 3-保密
     */
    private Integer gender;
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
