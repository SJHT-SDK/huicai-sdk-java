package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 查询订单详情
 *
 * @author ChenBo
 */
@Data
public class TaxiQueryOrderDetailsResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 运力类型，参见附录
     */
    private Integer rideType;
    /**
     * 订单状态，参见附录
     */
    private Integer orderStatus;
    /**
     * 订单创建时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String createTime;
    /**
     * 接单时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String acceptTime;
    /**
     * 到达上车点时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String arriveTime;
    /**
     * 开始服务时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String startServiceTime;
    /**
     * 到达目的地时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String endServiceTime;
    /**
     * 确认账单时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String confirmBillTime;
    /**
     * 下单用户手机号
     */
    private String userMobile;
    /**
     * 乘客手机号
     */
    private String passengerMobile;
    /**
     * 乘客姓名
     */
    private String passengerName;
    /**
     * 乘客虚拟号（若有则返回）
     */
    private String passengerVirtualPhone;
    /**
     * 乘客手机号国家代码，默认为 +86
     */
    private String passengerCountryCode;
    /**
     * 用户唯一id
     */
    private String passengerUid;
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
     * 实际上车点经度
     */
    private String startRealLongitude;
    /**
     * 实际上车点纬度
     */
    private String startRealLatitude;
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
     * 实际目的地经度
     */
    private String endRealLongitude;
    /**
     * 实际目的地纬度
     */
    private String endRealLatitude;
    /**
     * 订单总金额，单位：分
     */
    private Integer totalAmount;
    /**
     * 实际行驶距离（米）
     */
    private Integer mileage;
    /**
     * 实际行驶时间（秒）
     */
    private String duration;
    /**
     * 扩展信息
     */
    private String extInfo;
    /**
     * 司机信息
     */
    private TaxiDriver driver;
    /**
     * 车辆信息
     */
    private TaxiVehicle vehicle;
    /**
     * 费用明细列表
     */
    private List<TaxiFeeDetail> feeDetail;
}
