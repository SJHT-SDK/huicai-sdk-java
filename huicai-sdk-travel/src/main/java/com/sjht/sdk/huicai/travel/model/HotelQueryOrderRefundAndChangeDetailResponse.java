package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 酒店订单查询取消/提前离店申请单详情
 *
 * @author ChenBo
 */
@Data
public class HotelQueryOrderRefundAndChangeDetailResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 酒店ID
     */
    private String hotelId;
    /**
     * 酒店名称
     */
    private String hotelName;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 渠道单号
     */
    private String outerNo;
    /**
     * 差异单单号
     */
    private String discrepancyNo;
    /**
     * 差异单调整类型：0全单取消，1修改
     */
    private String modifyType;

    /**
     * 订单状态
     */
    private String orderStatus;
    /**
     * 预订人姓名
     */
    private String name;
    /**
     * 会员等级
     */
    private String memberLevel;
    /**
     * 预订房型
     */
    private String roomType;
    /**
     * 预订房间数
     */
    private String roomCount;
    /**
     * 入住日期 格式：yyyy-MM-dd
     */
    private String checkIn;
    /**
     * 离店日期 格式：yyyy-MM-dd
     */
    private String checkOut;
    /**
     * 间夜
     */
    private String nightCount;
    /**
     * 房费总金额
     */
    private BigDecimal orderTotalPrice;
    /**
     * 差异单创建日期 格式：yyyy-MM-dd HH:mm:ss
     */
    private String createDate;
    /**
     * 差异单审核日期 格式：yyyy-MM-dd HH:mm:ss
     */
    private String reviewDate;
    /**
     * 差异单审核状态（1待处理，2已同意，3已拒绝 5已撤销）
     */
    private String reviewStatus;
    /**
     * 差异单申请原因
     */
    private String applyReason;
    /**
     * 差异单拒绝原因
     */
    private String refuseReason;
    /**
     * 差异信息
     */
    private DiscrepancyInfoDTO discrepancyInfo;

    @Data
    public class DiscrepancyInfoDTO implements Serializable {
        /**
         * 总原间夜数
         */
        private Integer totalOriginalRoomNights;
        /**
         * 总调整后间夜数
         */
        private Integer totalAdjustedRoomNights;
        /**
         * 原房间总价(不含税点差)
         */
        private BigDecimal totalOriginalRoomPrice;
        /**
         * 原房间总价(含税点差)
         */
        private BigDecimal totalOriginalRoomTaxPrice;
        /**
         * 调整后房间总价(不含税点差)
         */
        private BigDecimal totalAdjustedRoomPrice;
        /**
         * 调整后房间总价(含税点差)
         */
        private BigDecimal totalAdjustedRoomTaxPrice;
        /**
         * 每日差异信息
         */
        private List<DailyDiscrepancy> dailyDiscrepancyList;
    }

    @Data
    class DailyDiscrepancy implements Serializable {
        /**
         * 日期 格式：yyyy-MM-dd HH:mm:ss
         */
        private String bizDate;
        /**
         * 原房间数
         */
        private Integer originalRoomCount;
        /**
         * 调整后房间数
         */
        private Integer adjustedRoomCount;
        /**
         * 门市价
         */
        private BigDecimal marketPrice;
        /**
         * 原房间单价(不含税点差)
         */
        private BigDecimal originalRoomPrice;
        /**
         * 原房间单价(含税点差)
         */
        private BigDecimal originalRoomTaxPrice;
        /**
         * 调整后房价(不含税点差)
         */
        private BigDecimal adjustRoomPrice;
        /**
         * 调整后房价(含税点差)
         */
        private BigDecimal adjustedRoomTaxPrice;
        /**
         * 原当天房费总计(不含税点差)
         */
        private BigDecimal originalDailyAmount;
        /**
         * 原当天房费总计(含税点差)
         */
        private BigDecimal originalDailyTaxAmount;
        /**
         * 调整后房费总计）(不含税点差)
         */
        private BigDecimal adjustDailyAmount;
        /**
         * 调整后房费总计(含税点差)
         */
        private BigDecimal adjustedDailyTaxAmount;
        /**
         * 调整后差价
         */
        private BigDecimal additionalDailyAmount;
    }
}
