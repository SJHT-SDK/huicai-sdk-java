package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 司机信息
 *
 * @author ChenBo
 */
@Data
public class TaxiDriver implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 司机x乘客虚拟手机号
     */
    private String mobile;
    /**
     * 司机x下单人虚拟手机号（代人叫车场景）
     */
    private String driverMobile;
    /**
     * 司机星级（5分制）
     */
    private String level;
    /**
     * 司机ID，司机身份唯一标识
     */
    private String driverId;
    /**
     * 司机头像
     */
    private String pirUrl;
    /**
     * 司机姓名 如：王师傅
     */
    private String driverName;
}
