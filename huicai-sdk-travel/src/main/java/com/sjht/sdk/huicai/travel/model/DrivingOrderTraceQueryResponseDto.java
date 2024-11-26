package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 代驾订单轨迹查询返回参数
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderTraceQueryResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

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
}
