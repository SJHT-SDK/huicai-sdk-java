package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 车辆信息
 *
 * @author ChenBo
 */
@Data
public class TaxiVehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 车辆id
     */
    private String id;
    /**
     * 车辆型号，最多9个中文字符 如：本田雅阁
     */
    private String model;
    /**
     * 车牌号
     */
    private String plate;
    /**
     * 车辆图片
     */
    private String picUrl;
    /**
     * 车辆颜色
     */
    private String carColor;
}
