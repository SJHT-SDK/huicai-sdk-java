package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代驾订单支付通知响应参数
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderPayedResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否处理成功 0-失败 1-成功
     */
    private Integer result;
}
