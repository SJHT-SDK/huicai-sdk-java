package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 获取酒店房量房价
 *
 * @author ChenBo
 */
@Data
public class HotelRoomPriceResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 酒店ID
     */
    private String hotelId;

    /**
     * 房价房量列表
     */
    private List<HotelRoomPrice> roomPriceList;

    /**
     * 房价房量信息
     *
     * @author ChenBo
     */
    @Data
    public static class HotelRoomPrice implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 房型id
         */
        private String roomId;
        /**
         * 房价码ID
         */
        private String rateCode;
        /**
         * 房价码名称
         */
        private String rateCodeName;
        /**
         * 房价码描述
         */
        private String rateCodeDescription;
        /**
         * 入住类型
         * NONE 不限制
         * HOUR 按小时
         * DAY 按天
         */
        private List<String> checkInTypeList;
        /**
         * 活动ID
         */
        private String activityId;
        /**
         * 房价码类型
         * 基础价：
         * RackRate：门市价
         * Base：会员价
         * RFPNegotiation：2020单店协议价
         * 活动价：
         * Standard：标准大促销活动(连住活动、提前预订)
         */
        private List<String> tagList;
        /**
         * 每日价格
         */
        private List<PriceDailyDto> priceDailyList;
        /**
         * 每日房量
         */
        private List<RoomCountDailyDto> roomCountDailyList;
        /**
         * 会员和早餐
         */
        private List<BreakFastDto> memberAndBreakFastList;
        /**
         * 会员等级
         */
        private List<String> memberLevels;
        /**
         * 预订政策
         */
        private BookInfoDto bookInfo;
        /**
         * 入住政策
         */
        private CheckInInfoDto checkInInfo;
        /**
         * 取消政策
         */
        private CancelInfoDto cancelInfo;
        /**
         * 其他政策
         */
        private OtherInfoDto otherInfo;

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
//            /**
//             * 税前价格
//             */
//            private Integer beforeTaxPrice;
            /**
             * 税后价格
             */
            private Integer afterTaxPrice;
//            /**
//             * 总对总价格
//             */
//            private Integer companyToGroupPrice;
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
            /**
             * 是否禁用
             */
            private Integer isForbidden;
            /**
             * 房型是否黑名单
             */
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
             * 开始预订日期，格式：yyyy-MM-dd
             */
            private String beginBookDate;
            /**
             * 结束预订日期，格式：yyyy-MM-dd
             */
            private String endBookDate;
            /**
             * 提前预订单位
             * NONE 不限制
             * HOUR 按小时
             * DAY 按天
             */
            private String bookUnit;
            /**
             * 最小提前多久预订，如果bookUnit是小时就是从24点倒推
             */
            private Integer minBookUnit;
            /**
             * 最大提前多久预订
             */
            private Integer maxBookUnit;
            /**
             * 开始入住日期，格式：yyyy-MM-dd
             */
            private String firstCheckInDate;
            /**
             * 结束入住日期，格式：yyyy-MM-dd
             */
            private String lastCheckOutDate;
            /**
             * 连续入住单位
             * NONE 不限制
             * HOUR 按小时
             * DAY 按天
             */
            private String checkInUnit;
            /**
             * 最小连续入住
             */
            private Integer minCheckInUnit;
            /**
             * 最大连续入住
             */
            private Integer maxCheckInUnit;
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
             * 最晚取消天
             */
            private Integer lastCancelDay;
            /**
             * 最晚取消时间，格式：yyyy-MM-dd HH:mm:ss
             */
            private String lastCancelTime;
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
}
