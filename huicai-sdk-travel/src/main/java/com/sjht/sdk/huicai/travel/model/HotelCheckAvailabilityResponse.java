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
public class HotelCheckAvailabilityResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动ID
     */
    private String activityId;

    /**
     * 房量
     */
    private CheckAvailabilityRoomCountDto roomCount;
    /**
     * 每日价格
     */
    private List<PriceDailyDto> priceDailyList;
    /**
     * 每日房量
     */
    private List<RoomCountDailyDto> roomCountDailyList;
    /**
     * 会员和早餐信息
     */
    private BreakFastDto memberBreakFast;
    /**
     * 预订信息
     */
    private BookInfoDto bookInfo;
    /**
     * 入住信息
     */
    private CheckInInfoDto checkInInfo;
    /**
     * 取消信息
     */
    private CancelInfoDto cancelInfo;
    /**
     * 其他信息
     */
    private OtherInfoDto otherInfo;

    /**
     * 房量信息
     *
     * @author ChenBo
     */
    @Data
    public static class CheckAvailabilityRoomCountDto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 房型ID
         */
        private String roomId;
        /**
         * 保留房量
         */
        private Integer retainCount;
        /**
         * 共享房量
         */
        private Integer shareCount;
        /**
         * 可用房量
         */
        private Integer availableCount;

    }

    /**
     * 每日价格
     *
     * @author ChenBo
     */
    @Data
    public static class PriceDailyDto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 房型ID
         */
        private String roomId;
        /**
         * 营业日
         */
        private String bizDate;
        /**
         * 币种
         */
        private String currencyCode;
        /**
         * 市场价
         */
        private Integer marketPrice;
        /**
         * 税前价格
         */
        private Integer beforeTaxPrice;
        /**
         * 税后价格
         */
        private Integer afterTaxPrice;
        /**
         * 总对总价格
         */
        private Integer companyToGroupPrice;
        /**
         * 是否被禁用的
         */
        private Integer isForbidden;
        private Integer isBlack;
    }

    /**
     * 每日房量
     *
     * @author ChenBo
     */
    @Data
    public static class RoomCountDailyDto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 房型ID
         */
        private String roomId;
        /**
         * 营业日
         */
        private String bizDate;
        /**
         * 保留房量
         */
        private Integer retainCount;
        /**
         * 共享房量
         */
        private Integer shareCount;
        /**
         * 可用房量
         */
        private Integer availableCount;
        private Integer isForbidden;
        private Integer isBlack;
    }

    /**
     * 会员和早餐信息
     *
     * @author ChenBo
     */
    @Data
    public static class BreakFastDto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 会员等级
         */
        private String memberLevel;
        /**
         * 早餐数量
         */
        private Integer breakfastCount;
    }

    /**
     * 预订信息
     *
     * @author ChenBo
     */
    @Data
    public static class BookInfoDto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 担保模式  NONE：无  FIRST_NIGHT：首晚担保   FULL_AMOUNT：全额担保
         */
        private String guaranteeMode;

        /**
         * 保留时间
         */
        private String holdTime;
        /**
         * 预订说明
         */
        private String bookDesc;
    }

    /**
     * 入住信息
     *
     * @author ChenBo
     */
    @Data
    public static class CheckInInfoDto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 是否必须本人本卡  0-否   1-是
         */
        private Integer isOneSelf;
        /**
         * 入住说明
         */
        private String checkInDesc;
    }

    /**
     * 取消信息
     *
     * @author ChenBo
     */
    @Data
    public static class CancelInfoDto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 是否可取消   0-否   1-是
         */
        private Integer isCanCancel;
        /**
         * 最晚取消时间
         */
        private String lastCancelDate;
        /**
         * 取消说明
         */
        private String cancelDesc;
    }

    /**
     * 其它信息
     *
     * @author ChenBo
     */
    @Data
    public static class OtherInfoDto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 是否必须使用促销券码才能预订  0-否   1-是
         */
        private Integer isPromotionCodeCanBook;
        /**
         * 是否支持优惠券
         */
        private Integer isCanUseCoupon;
        /**
         * 其他说明
         */
        private String otherDesc;
    }
}
