package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建订单
 *
 * @author ChenBo
 */
@Data
public class TaxiCreateOrderRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 接入方业务系统内部订单号，只能是数字、大小写字母_-*，且在同一个AppId下唯一
     */
    private String appOrderNo;
    /**
     * 世纪恒通打车用车服务SKU ID
     */
    private String serviceSkuId;
    /**
     * 1	实时用车
     * 2	预约实时计费
     * 11	预约一口价接机	暂不开放
     * 12	预约一口价送机	暂不开放
     * 21	预约一口价接站	暂不开放
     * 22	预约一口价送站	暂不开放
     * 15	预约一口价用车	暂不开放
     */
    private Integer serviceType;
    /**
     * 城市行政编码
     */
    private String cityCode;
    /**
     * 出发地经度
     */
    private String startLongitude;
    /**
     * 出发地纬度
     */
    private String startLatitude;
    /**
     * 出发地名称
     */
    private String startName;
    /**
     * 出发地详细地址
     */
    private String startAddress;
    /**
     * 目的地经度
     */
    private String endLongitude;
    /**
     * 目的地纬度
     */
    private String endLatitude;
    /**
     * 目的地名称
     */
    private String endName;
    /**
     * 目的地详细地址
     */
    private String endAddress;
    /**
     * 预估价格标识
     */
    private String estimateId;
    /**
     * 订单状态变更回调通知地址
     */
    private String notifyUrl;
    /**
     * 下单用户手机号（仅代人叫车场景使用：即下单人和乘车人不一致时，需要传入该字段，否则不需要传）
     */
    private String userMobile;
    /**
     * 乘客手机号，用于司机确认乘客身份
     */
    private String passengerMobile;
    /**
     * 乘客姓名
     */
    private String passengerName;
    /**
     * 乘客手机号国家代码，默认为 +86
     */
    private String passengerCountryCode;
    /**
     * 乘客虚拟号（若无可不填），用户下发给司机联系乘客
     */
    private String passengerVirtualPhone;
    /**
     * 用户唯一id
     */
    private String passengerUid;
    /**
     * 乘客虚拟号（若无可不填），用户下发给司机联系乘客
     */
    private Integer rideType;
    /**
     * 用车时间（实时用车业务此值不做为询价参考值，默认为当前时间），预约业务必填，格式：yyyy-MM-dd HH:mm:ss
     */
    private String departureTime;
    /**
     * 给司机留言内容，通过base64编码以后不超过92字符（约69字）
     */
    private String driverMessage;
    /**
     * 一口价金额，单位：分
     */
    private Integer fixedPrice;
    /**
     * 航班号，接送机业务必填
     */
    private String flightNumber;
    /**
     * 接送机-出发机场三字码，送机必填（预留暂不使用）
     */
    private String depAirCode;
    /**
     * 接送机-到达机场三字码，接机必填（预留暂不使用）
     */
    private String arrAirCode;
    /**
     * 二级分销ID
     */
    private String distributorsId;
    /**
     * 二级分销名称
     */
    private String distributorsName;
}
