package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 预估价格费用明细
 *
 * @author ChenBo
 */
@Data
public class TaxiFeeDetailDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 明细类型
     */
    private String type;
    /**
     * 价格金额 单位：分
     */
    private Integer amount;
    /**
     * 费用描述
     */
    private String description;
}
