package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 提前离店预审
 *
 * @author ChenBo
 */
@Data
public class HotelOrderDiscrepantInfoResponse implements Serializable {
    private static final long serialVersionUID = 1L;
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
