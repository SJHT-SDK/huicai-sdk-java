package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 代驾订单查询返回参数
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderFeeDetailQueryResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单总费用（单位：分）
     */
    private Integer totalFee;
    /**
     * 行驶时长（单位：秒）。当司机接单前没有此字段。
     */
    private Integer drivingTime;
    /**
     * 行权益抵扣金额
     */
    private Integer deductionAmount;
    /**
     * 费用明细。订单产生费用后才有此字段。
     */
    private List<DrivingOrderFeeInfoDto> feeDetailList;
}
