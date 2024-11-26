package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 订单轨迹位置信息
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderTraceInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前位置经度信息
     */
    private String Longitude;
    /**
     * 当前位置纬度信息
     */
    private String Latitude;
    /**
     * 当前位置对应时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String time;
}
