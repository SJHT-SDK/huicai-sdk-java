package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 费用明细
 *
 * @author ChenBo
 */
@Data
public class TaxiFeeDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 明细类型
     */
    private String type;
    /**
     * 价格金额 单位：分
     */
    private String amount;
    /**
     * 费用描述
     */
    private String description;
}
