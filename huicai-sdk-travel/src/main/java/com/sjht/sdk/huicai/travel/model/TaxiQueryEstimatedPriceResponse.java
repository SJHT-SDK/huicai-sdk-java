package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 查询预估价
 *
 * @author ChenBo
 */
@Data
public class TaxiQueryEstimatedPriceResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 预估距离，单位：米
     */
    private Integer mileage;
    /**
     * 预估时长，单位：秒
     */
    private Integer duration;
    /**
     * 费用明细列表
     */
    private List<TaxiEstimatedPriceDto> pricesList;
}
