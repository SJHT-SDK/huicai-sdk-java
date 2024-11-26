package com.sjht.sdk.huicai.travel.model;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 代驾订单查询返回参数
 *
 * @author ChenBo
 */
@Data
public class DrivingOpenOrderQueryResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 用户手机号码
     */
    private String userMobile;
    /**
     * 订单状态
     * 0-派单中
     * 40-派单失败
     * 30-司机接单
     * 31-司机就位
     * 33-司机开车
     * 20-取消（未产生费用）
     * 21-订单取消待支付（产生费用）
     * 22-取消费支付完成
     * 60-到达目的地
     * 70-待支付
     * 80-已支付
     * 99-未知的上游状态
     */
    private Integer orderStatus;
    /**
     * 订单状态机（包含上游）
     */
    private JSONObject orderStatusJson;
    /**
     * 免等候时间（单位：秒）。不同的服务商不一定会返回该值。
     */
    private Integer waitFreeMinute;
    /**
     * 免责取消时间（单位：秒）。不同的服务商不一定会返回该值。
     */
    private Integer cancelFeeFreeMinute;
    /**
     * 车牌号信息，司机接单才会有车牌号信息。
     */
    private String plateNumber;
    /**
     * 车辆照片url列表。司机接单才会有车辆照片信息。
     */
    private List<String> carPhotoUrls;
    /**
     * 接单司机信息。派单成功司机接单才有司机信息字段
     */
    private DriverInfoDto driverInfo;

    /**
     * 司机接单至就位轨迹
     */
    private List<DrivingOrderTraceInfoDto> acceptToArriveTrace;
    /**
     * 司机就位至等待乘客轨迹
     */
    private List<DrivingOrderTraceInfoDto> awaitCustomerTrace;
    /**
     * 行驶轨迹集合。开始行驶状态会进行更新，但有些代驾服务商不返回。
     */
    private List<DrivingOrderTraceInfoDto> drivingTrace;
    /**
     * 代驾司机接单位置信息。有些代驾服务商不返回。
     */
    private DrivingOrderTraceInfoDto acceptOrderPosition;
    /**
     * 司机就位位置。代驾司机到达乘客指定代驾地点的司机就位位置，有些代驾服务商不返回。
     */
    private DrivingOrderTraceInfoDto arrivePositon;
    /**
     * 代驾司机开车位置。有些代驾服务商不返回。
     */
    private DrivingOrderTraceInfoDto drivePosition;
    /**
     * 订单结束位置。有些代驾服务商不返回。
     */
    private DrivingOrderTraceInfoDto finishPosition;
    /**
     * 费用明细
     */
    private DrivingOrderFeeDetailQueryResponseDto feeDetail;
}
