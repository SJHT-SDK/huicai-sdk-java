package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取酒店房量房价
 *
 * @author ChenBo
 */
@Data
public class HotelRoomPriceRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 酒店ID
     */
    private String hotelId;
    /**
     * 酒店服务SKU ID，由世纪恒通为业务接入方开通后提供
     */
    private String serviceSkuId;
    /**
     * 入住日期,格式：yyyy-MM-dd
     */
    private String checkInDate;
    /**
     * 离店日期,格式：yyyy-MM-dd
     */
    private String checkOutDate;
    /**
     * 房型ID
     */
    private String roomId;
//    /**
//     * 一间房的入住人数，用于获取多人价（一人价、两人价）
//     * 注：针对海外酒店使用
//     */
//    private Integer adultsPerRoom;
}
