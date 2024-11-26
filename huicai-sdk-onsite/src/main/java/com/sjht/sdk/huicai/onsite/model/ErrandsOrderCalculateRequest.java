package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单计费
 *
 * @author ChenBo
 */
@Data
public class ErrandsOrderCalculateRequest implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 世纪恒通SKU ID
     */
    private String skuId;

    /**
     * 订单子类型  0-实时订单  1-预约订单
     */
    private Integer orderSubType;
    /**
     * 用户手机号
     */
    private String userMobile;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 物流类型  1-帮我送  2-帮我取
     */
    private Integer deliveryType;
    /**
     * 物品类型  0-其它  1-文件  2-数码  3-蛋糕  4-餐饮  5-鲜花  6-汽配  7-母婴  8-医疗健康  9-商超  10-水果  11-钥匙
     */
    private Integer goodType;
    /**
     * 蛋糕尺寸，当goodType为3时，必传
     * 1	4寸
     * 2	6寸
     * 3	8寸
     * 4	10寸
     * 5	12寸
     * 6	14寸
     * 7	16寸
     * 8	20寸
     * 9	多层
     * 10	18寸
     */
    private Integer goodsSize;
    /**
     * 总重量，单位：kg
     * 向上取整整数，例如：6.7kg传7；最大重量不超过999kg
     */
    private Integer totalWeight;

    /**
     * 订单计费总金额
     */
    private String orderPrice;
    /**
     * 预约时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String bookingTime;
    /**
     * 省份区域编码
     */
    private String provinceCode;
    /**
     * 省份名称
     */
    private String provinceName;
    /**
     * 城市区域编码
     */
    private String cityCode;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 区县区域编码
     */
    private String countyCode;
    /**
     * 区县名称
     */
    private String countyName;
    /**
     * 寄件人详细地址
     */
    private String deliverAddress;
    /**
     * 寄件人坐标经度
     */
    private String deliverLongitude;
    /**
     * 寄件人坐标纬度
     */
    private String deliverLatitude;
    /**
     * 寄件人姓名
     */
    private String deliverUserName;
    /**
     * 寄件人联系电话
     */
    private String deliverUserMobile;
    /**
     * 收件人详细地址
     */
    private String receiverAddress;
    /**
     * 收件人坐标经度
     */
    private String receiverLongitude;
    /**
     * 收件人坐标纬度
     */
    private String receiverLatitude;
    /**
     * 收件人姓名
     */
    private String receiverUserName;
    /**
     * 收件人联系电话
     */
    private String receiverUserMobile;
    /**
     * 是否投保  0:不投保;1:投保，默认值为0。投保金额以insurancePrice为准。投保将按照一定费率收取保价费用
     */
    private Integer insuranceFlag;
    /**
     * 投保金额，单位：分。insuranceFlag为1时，必传。闪送会根据投保金额计算保险费用，如果你的物品破损或丢失，将可根据投保金额进行索赔
     */
    private Integer insurancePrice;
}
