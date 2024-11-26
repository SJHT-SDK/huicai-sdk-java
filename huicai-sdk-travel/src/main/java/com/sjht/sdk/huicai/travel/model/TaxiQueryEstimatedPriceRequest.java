package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询预估价
 *
 * @author ChenBo
 */
@Data
public class TaxiQueryEstimatedPriceRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 世纪恒通打车用车服务SKU ID
     */
    private String serviceSkuId;
    /**
     * 服务类型
     */
    private Integer serviceType;
    /**
     * 城市行政编码
     * 区域编码：https://open.sjht.com/docs/pages/171f16/
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
    private String endAddress;
    /**
     * 运力类型，不传表示全部，多个使用英文 "," 分隔
     */
    private String rideType;
    /**
     * 用车时间（实时用车业务此值不做为询价参考值，默认为当前时间），预约业务必填，格式：yyyy-MM-dd HH:mm:ss
     */
    private String departureTime;
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
}
