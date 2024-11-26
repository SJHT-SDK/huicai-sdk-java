package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取入住码响应参数
 *
 * @author ChenBo
 */
@Data
public class HotelQueryOrderPhraseNoResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 酒店ID
     */
    private String hotelId;
    /**
     * 入住码
     */
    private String phraseNo;
}
