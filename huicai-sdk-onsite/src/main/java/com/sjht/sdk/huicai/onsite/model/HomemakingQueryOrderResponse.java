package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单查询
 *
 * @author ChenBo
 */
@Data
public class HomemakingQueryOrderResponse implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 订单总金额，单位：分
     */
    private Integer totalAmount;
    /**
     * 订单支付金额，单位：分
     */
    private Integer payAmount;
    /**
     * 订单结算金额，单位：分
     */
    private Integer settlementAmount;
    /**
     * 坐标经度
     */
    private String longitude;
    /**
     * 坐标纬度
     */
    private String latitude;
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
     * 区县编码
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
     * 服务地址，街道信息，精确到小区
     */
    private String street;
    /**
     * 服务地址，门牌号等详细地址
     */
    private String address;
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
     * 服务商品名称
     */
    private String goodsName;
    /**
     * 服务商品数量
     */
    private Integer goodsCount;
    /**
     * 订单状态 0-待支付 1-待确认 2-待派单 3-待服务 4-服务中 10-已完成 11-售后中 20-已取消 21-已暂停 22-已过期 23-商家未履约 24-用户未履约
     */
    private Integer orderStatus;
//    /**
//     * 订单支付状态  0-待支付  1-已支付 2-支付中 3-支付失败 4-部分支付  10-退款中  20-已退款 21-部分退款 30-退款失败
//     */
//    private Integer payStatus;
    /**
     * 订单创建时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String orderCreateTime;
//    /**
//     * 订单支付时间，格式：yyyy-MM-dd HH:mm:ss
//     */
//    private String orderPayTime;
    /**
     * 确认时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String confirmTime;
    /**
     * 派单时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String distributeTime;
    /**
     * 服务上门时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String visitTime;
    /**
     * 服务完成时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String completeTime;
    /**
     * 订单取消时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String cancelTime;
    /**
     * 订单取消备注
     */
    private String cancelRemark;
    /**
     * 用户订单备注
     */
    private String remark;
    /**
     * 扩展透传数据
     */
    private String expandData;
}
