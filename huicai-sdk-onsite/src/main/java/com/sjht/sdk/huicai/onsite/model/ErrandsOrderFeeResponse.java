package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单计费费用明细
 *
 * @author ChenBo
 */
@Data
public class ErrandsOrderFeeResponse implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 费用类型标识
     */
    private String feeId;
    /**
     * 费用标题。例：里程费
     */
    private String feeTitle;
    /**
     * 费用金额（单位：分）
     */
    private Integer feeAmount;
}
