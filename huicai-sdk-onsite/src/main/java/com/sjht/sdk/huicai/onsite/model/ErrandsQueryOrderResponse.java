package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 订单查询
 *
 * @author ChenBo
 */
@Data
public class ErrandsQueryOrderResponse implements Serializable {

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
     * 订单状态 0-待支付 1-待确认  2-待派单  3-待服务  4-服务中  10-已完成  11-售后中  20-已取消  21-已暂停  22-已过期  23-商家未履约  24-用户未履约
     */
    private Integer orderStatus;
    /**
     * 订单子状态   21-派单中  22-转单改派中  31-待取货  32-跑腿已就位  41-配送中  42-申请取消中  43-物品送回中  44-取消单客服介入中  51-已完成  52-已退款  53-已取消
     */
    private Integer orderSubStatus;
    /**
     * 物流类型  1-帮我送  2-帮我取
     */
    private Integer deliveryType;
    /**
     * 物品类型  0-其它  1-文件  2-数码  3-蛋糕  4-餐饮  5-鲜花  6-汽配  7-母婴  8-医疗健康  9-商超  10-水果  11-钥匙
     */
    private Integer goodType;
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
     * 送回费用金额，单位：分
     */
    private Integer sendBackFeeAmount;
    /**
     * 退款金额，单位：分
     */
    private Integer refundAmount;
    /**
     * 总距离，单位：米
     */
    private Integer totalDistance;
    /**
     * 总重量，单位：kg
     */
    private Integer totalWeight;
    /**
     * 跑腿员手机号码
     */
    private String courierMobile;
    /**
     * 跑腿员姓名
     */
    private String courierName;
    /**
     * 取件超时时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String pickupTimeoutTime;
    /**
     * 跑腿取件照片地址，多张照片使用,号相隔
     */
    private String courierPickupPhotos;
    /**
     * 跑腿收件照片地址，多张照片使用,号相隔
     */
    private String courierDeliveryPhotos;
    /**
     * 扩展透传数据
     */
    private String expandData;
    /**
     * 费用明细列表
     */
    private List<ErrandsOrderFeeResponse> feeList;
}
