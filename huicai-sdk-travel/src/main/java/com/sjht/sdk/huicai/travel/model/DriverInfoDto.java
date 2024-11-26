package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代驾司机信息
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代驾商家code.即哪家代驾服务商接的单
     */
    private String driveIsvCode;
    /**
     * 接单司机姓名
     */
    private String driverName;
    /**
     * 代驾司机联系方式
     */
    private String driverMobile;
    /**
     * 代驾司机距离用户距离，单位：米
     */
    private Integer distance;
    /**
     * 接单司机工号，有些代驾服务商不返回
     */
    private String driverId;
    /**
     * 代驾司机经度，有些代驾服务商不返回
     */
    private String longitude;
    /**
     * 代驾司机纬度，有些代驾服务商不返回
     */
    private String latitude;
    /**
     * 代驾司机星级，有些代驾服务商不返回
     */
    private String starLever;
    /**
     * 驾龄，有些代驾服务商不返回
     */
    private Integer drivingYears;
    /**
     * 代驾次数，有些代驾服务商不返回
     */
    private Integer serviceTimes;
    /**
     * 司机照片url，有些代驾服务商不返回
     */
    private String photoUrl;
}
