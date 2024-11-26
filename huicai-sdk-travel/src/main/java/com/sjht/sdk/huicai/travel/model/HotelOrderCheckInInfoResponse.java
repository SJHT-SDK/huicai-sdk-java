package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 酒店订单处理结果响应参数
 *
 * @author ChenBo
 */
@Data
public class HotelOrderCheckInInfoResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    private String orderId;
    /**
     * 预订单状态
     */
    private String orderStatus;

    /**
     * 当前房费
     */
    private BigDecimal roomCharge;
    /**
     * 税点差金额
     */
    private BigDecimal taxDiffAmount;
    /**
     * 入驻码
     */
    private List<OrderCheckInInfoDTO> checkInInfoList;

    @Data
    class OrderCheckInInfoDTO implements Serializable {
        /**
         * 接待单id
         */
        private String receptionOrderId;

        /**
         * 接待单状态
         * R：预订中
         * X：取消
         * I：入住
         * O：离店
         * N：NoShow
         * S：临时挂账
         */
        private String receptionStatus;
        /**
         * 实际入住时间
         */
        private String checkIn;
        /**
         * 实际离店时间
         */
        private String checkOut;
    }
}
