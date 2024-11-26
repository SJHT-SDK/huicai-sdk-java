package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代驾订单费用明细
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderFeeInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 费用类型标识。参照本文档【费用类型枚举表】；例：fee_wait
     */
    private String feeId;
    /**
     * 代驾费用标题。参照本文档【费用类型枚举表】；例：等候费
     */
    private String feeTitle;
    /**
     * 费用金额（单位：分）
     */
    private Integer feeAmount;
    /**
     * 费用真实描述。注意和feeTitle区分开，此描述长度请保持在16个字以内。
     * 此字段直接显示在费用明细页面中；例：等候费（3分钟）
     */
    private String feeDesc;
}
