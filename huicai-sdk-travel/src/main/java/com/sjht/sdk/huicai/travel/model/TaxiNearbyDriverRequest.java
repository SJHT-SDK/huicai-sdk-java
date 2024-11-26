package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询附近司机
 *
 * @author ChenBo
 */
@Data
public class TaxiNearbyDriverRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 世纪恒通打车用车服务SKU ID
     */
    private String serviceSkuId;
    /**
     * 出发地经度
     */
    private String longitude;
    /**
     * 出发地纬度
     */
    private String latitude;
    /**
     * 搜索半径距离，单位：米
     */
    private String distance;
    /**
     * 运力类型，多个使用英文 "," 分隔
     */
    private String rideType;
}
