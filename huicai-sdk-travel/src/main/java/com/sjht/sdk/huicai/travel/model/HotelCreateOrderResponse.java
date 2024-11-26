package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 创建订单
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelCreateOrderResponse implements Serializable {

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
     * 预定状态  0-预定处理中   10-预定完成  20-已取消
     */
    private Integer bookStatus;
}
