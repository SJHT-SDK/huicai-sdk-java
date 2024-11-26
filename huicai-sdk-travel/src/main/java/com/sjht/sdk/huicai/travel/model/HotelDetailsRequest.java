package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取酒店详情
 *
 * @author ChenBo
 */
@Data
public class HotelDetailsRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 酒店ID
     */
    private String hotelId;
    /**
     * 酒店服务SKU ID，由世纪恒通为业务接入方开通后提供
     */
    private String serviceSkuId;
}
