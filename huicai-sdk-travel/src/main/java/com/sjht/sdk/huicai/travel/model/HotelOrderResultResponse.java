package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 酒店订单处理结果响应参数
 *
 * @author ChenBo
 */
@Data
public class HotelOrderResultResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否处理成功 0-失败 1-成功
     */
    private Integer result;
}
