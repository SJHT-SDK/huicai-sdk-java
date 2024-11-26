package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 获取酒店详情
 *
 * @author ChenBo
 */
@Data
public class HotelDetailsResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 酒店ID
     */
    private String hotelId;
    /**
     * 品牌ID
     */
    private String brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 酒店名称
     */
    private String hotelName;
    /**
     * 酒店名称英文
     */
    private String hotelNameEn;
    /**
     * 省ID
     */
    private String provinceNo;
    /**
     * 省名称
     */
    private String provinceName;
    /**
     * 城市ID
     */
    private String cityNo;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 城市区域名称
     */
    private String cityArea;
    /**
     * 区县名称
     */
    private String countyName;
    /**
     * 区县ID
     */
    private String countyNo;
    /**
     * 国家名称
     */
    private String nationName;
    /**
     * 国家ID
     */
    private String nationNo;
    /**
     * 酒店地址
     */
    private String hotelAddress;
    /**
     * 酒店地址英文
     */
    private String hotelAddressEn;
    /**
     * 酒店地址提示
     */
    private String hotelAddressTip;
    /**
     * 电话
     */
    private String hotelTelephone;
    /**
     * 酒店传真
     */
    private String hotelFax;
    /**
     * 邮政编码
     */
    private String zipCode;
    /**
     * 客房数
     */
    private Integer roomNum;
    /**
     * 酒店介绍
     */
    private String hotelWordIntroduce;
    /**
     * 酒店经度 高德地图
     */
    private String longitude;
    /**
     * 酒店纬度 高德地图
     */
    private String latitude;
    /**
     * 营业日期
     */
    private String openingDate;
    /**
     * 试营业日期
     */
    private String trialOpeningDate;
    /**
     * 经营性质
     */
    private String operateScope;
    /**
     * 是否营业
     */
    private String isOpening;
    /**
     * 酒店类别
     */
    private String hotelClassification;
//    /**
//     * 纳税人性质 NONE：未知 GENERAL：一般纳税人 COMMON：小规模纳税人
//     */
//    private String scaleOfTaxpayer;
    /**
     * 联系人职位
     */
    private String contactPosition;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人手机
     */
    private String contactMobile;
    /**
     * 联系人邮箱
     */
    private String contactEmail;
    /**
     * 联系人邮箱
     */
    private String contactFax;
    /**
     * 是否国际酒店  0-否  1-是
     */
    private Integer isInternational;
    /**
     * 是否仅允许前台现付，不支持调用支付链接付款，仅针对海外酒店  0-否  1-是
     */
    private String payAtHotelOnly;
    //    /**
    //     * 支持的业务模式
    //     * CASH：现付，例如 ：到门店付、调个人支付链接付款
    //     * COMPANY_ADVANCE：企业预付，例如：支付宝立即扣、中航结立即扣
    //     * CREDIT：信用，例如：担保金月结，担保金离店T+N扣款
    //     * 注：会返回1-3个枚举，如果某企业要支持信用模式，那么此字段必须包含“CREDIT”
    //     */
    //    private List<String> businessTypeEnumSet;
    //    /**
    //     * 支持的担保模式
    //     * NONE：无
    //     * FIRST_NIGHT：首晚担保
    //     * FULL_AMOUNT：全额担保
    //     */
    //    private String guaranteeModeEnumSet;
    /**
     * 酒店房型信息
     */
    private List<HotelRoomInfo> hotelRoomList;
    /**
     * 酒店设施信息
     */
    private List<HotelService> hotelServiceList;
    /**
     * 酒店照片
     */
    private List<HotelPhoto> hotelPhotoList;
    /**
     * 酒店交通信息
     */
    private List<HotelTrafficLine> hotelTrafficLineList;
    /**
     * 酒店营建信息
     */
    private List<HotelConstructLevel> hotelConstructLevelList;
    /**
     * 客户拥有的单店特权
     */
    private List<HotelSpecialService> hotelSpecialServiceList;

    /**
     * 房型信息
     *
     * @author ChenBo
     */
    @Data
    public static class HotelRoomInfo implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 房型ID
         */
        private String roomId;
        /**
         * 房型Name
         */
        private String roomName;
        /**
         * 房型Name英文
         */
        private String roomNameEn;
        /**
         * 房间数量
         */
        private Integer roomNum;
        /**
         * 房间描述
         */
        private String summary;
        /**
         * 面积
         */
        private Integer hotelArea;
        /**
         * 楼层
         */
        private String floorPlace;
        /**
         * 床型   双人床，特大床，大床，单人床，沙发床，双床，多床，大床房，双床房
         */
        private String bedType;
        /**
         * 床宽1.8/2.0，1.5/2.0
         */
        private String bedWidth;
        /**
         * 是否可宽带上网
         */
        private String isADSL;
        /**
         * 是否客房WIFI覆盖
         */
        private String isADSLWifi;
        /**
         * 是否有窗   有窗、部分有窗、无窗、无窗
         */
        private String isHasWindow;
        /**
         * 能否加床
         */
        private String isCanAddBed;
        /**
         * 无烟
         */
        private String hasSmokeFree;
        /**
         * 最多入住人数
         */
        private Integer maxCheckInPeoNum;
        /**
         * 房型图片URL
         */
        private String roomTypePhotoUrl;
        /**
         * 窗户
         */
        private String isHasWindowNewDesc;
    }


    /**
     * 设施服务
     *
     * @author ChenBo
     */
    @Data
    public static class HotelService implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 设施Code
         */
        private String childClassCode;
        /**
         * 设施Name
         */
        private String childClassName;
        /**
         * 设施描述
         */
        private String childClassNameDesc;
        /**
         * 设施类型
         * 1：综合设施
         * 2：服务项目
         * 3：客房设施
         * 4：餐饮设施
         * 5：娱乐设施
         */
        private Integer childClassType;
        /**
         * 设施在室内还是室外
         */
        private String isInside;
        /**
         * 设施是否免费
         */
        private String isFree;
    }

    /**
     * 酒店照片
     *
     * @author ChenBo
     */
    @Data
    public static class HotelPhoto implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 房型ID
         * 酒店外部照片 ChildClassCode= 0 &roomId = "" 酒店内部照片 ChildClassCode!= 0 & roomId = "" 房型照片 roomId = 对应房型Code
         */
        private String roomId;
        /**
         * 设施Code
         */
        private Integer childClassCode;
        /**
         * 场所名称
         */
        private String roomName;
        /**
         * 场所描述	门头照、形象照-大、形象照-小、精选图片、地图、房型照、其他（公共区域、综合、服务、客房、餐饮、娱乐） 酒店列表页面建议展示“门头照”
         */
        private String roomDesc;
        /**
         * 图片URL(多个)
         */
        private List<String> photoUrl;
    }

    /**
     * 酒店照片
     *
     * @author ChenBo
     */
    @Data
    public static class HotelTrafficLine implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 起始地点(出发地)
         */
        private String starting;
        /**
         * 公交
         */
        private Integer isBus;
        /**
         * 地铁
         */
        private Integer isMetro;
        /**
         * 自驾
         */
        private Integer isDrive;
        /**
         * 出租车
         */
        private Integer isTaxi;
        /**
         * 路线描述
         */
        private String lineDesc;
    }

    /**
     * 酒店营建信息
     *
     * @author ChenBo
     */
    @Data
    public static class HotelConstructLevel implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 酒店营建标准No
         */
        private String constructLevelNo;
        /**
         * 酒店营建标准Name
         */
        private String constructLevelName;
    }

    /**
     * 客户拥有的单店特权
     *
     * @author ChenBo
     */
    @Data
    public static class HotelSpecialService implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 单店特权Id
         */
        private String serviceId;
        /**
         * 单店特权名称
         */
        private String serviceName;
        /**
         * 单店特权开始时间
         */
        private String startTime;
        /**
         * 单店特权结束时间
         */
        private String endTime;
        /**
         * 使用规则
         */
        private String useRules;
        /**
         * 每周禁用日 格式0101010，从周一开始，0：不禁用，1：禁用
         */
        private String weekDisableDays;
        /**
         * 禁用日期列表
         */
        private List<DisableDate> disableDateList;
        /**
         * 可以使用的卡号
         */
        private List<String> serviceBookerIdList;

        /**
         * 禁用日期
         *
         * @author ChenBo
         */
        @Data
        public static class DisableDate implements Serializable {

            private static final long serialVersionUID = 1L;

            /**
             * 禁用开始时间
             */
            private String startTime;
            /**
             * 禁用结束时间
             */
            private String endTime;
        }
    }
}
