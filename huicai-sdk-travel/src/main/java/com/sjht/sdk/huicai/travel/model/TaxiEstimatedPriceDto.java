package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 预估价格费用明细
 *
 * @author ChenBo
 */
@Data
public class TaxiEstimatedPriceDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 运力类型
     */
    private Integer rideType;
    /**
     * 预估标识，下单时使用，有效期 10 分钟
     */
    private String estimateId;
    /**
     * 动态折扣（现价与原价的比值），默认值1
     */
    private String dynamicRate;
    /**
     * 预估费用，单位：分
     */
    private Integer estimatePrice;
    /**
     * 预估费用明细
     */
    private List<TaxiFeeDetailDto> detail;
}
