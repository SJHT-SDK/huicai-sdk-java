package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 下单前验证是否可定指定房型
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelCheckAvailabilityRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 酒店ID
     */
    private String hotelId;
    /**
     * 房型ID
     */
    private String roomId;
    /**
     * 酒店服务SKU ID，由世纪恒通为业务接入方开通后提供
     */
    private String serviceSkuId;
    /**
     * 入住日期,格式：yyyy-MM-dd
     */
    private String checkInDate;
    /**
     * 离店日期,格式：yyyy-MM-dd
     */
    private String checkOutDate;
    /**
     * 房价码
     */
    private String rateCode;
    /**
     * 预定房间数
     */
    private Integer roomCount = 1;
    /**
     * 预订人手机号码
     */
    private String bookerPersonMobile;
    /**
     * 预订价格类型   个人：PERSON  企业：COMPANY
     */
    private String bookerPriceType;
    /**
     * 是否总对总   0-现付订单  1-总对总订单，包括预付和信用
     */
    private Integer isGroup;
    /**
     * 担保模式  NONE：无  FIRST_NIGHT：首晚担保   FULL_AMOUNT：全额担保
     */
    private String guaranteeMode;
    /**
     * 活动ID，会员价非必填 活动价必填
     */
    private String activityId;
    /**
     * 一间房的入住人数，用于获取多人价（一人价、两人价）
     */
    private Integer adultsPerRoom;
    /**
     * 币种
     * 海外酒店需要传输
     */
    private String currencyCode;
    /**
     * 优惠券列表
     */
    private List<String> couponNos;
    /**
     * 每日房价
     */
    private List<DailyPrice> dailyPriceList;

    @Data
    public static class DailyPrice implements Serializable {
        /**
         * 营业日，格式：yyyy-MM-dd
         */
        private String bizDate;
        /**
         * 房价（税后价）
         */
        private Integer afterTaxPrice;
        /**
         * 优惠券码
         */
        private String couponNo;
    }
}
