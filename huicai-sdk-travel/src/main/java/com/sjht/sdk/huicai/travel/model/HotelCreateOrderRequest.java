package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建订单
 *
 * @author ChenBo
 */
@Data
public class HotelCreateOrderRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 接入方业务系统内部订单号，只能是数字、大小写字母_-*，且在同一个AppId下唯一
     */
    private String appOrderNo;
    /**
     * 预订人手机号码
     */
    private String bookerPersonMobile;
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
     * 订单状态变更回调通知地址
     */
    private String notifyUrl;
    /**
     * 联系人姓名
     */
    private String linkName;
    /**
     * 联系人手机
     */
    private String linkMobile;
    /**
     * 联系人邮箱
     */
    private String linkEmail;
    /**
     * 入住类型  DAY：天  HOUR：小时
     */
    private String checkInType;
    /**
     * 入住日期,格式：yyyy-MM-dd
     */
    private String checkInDate;
    /**
     * 离店日期,格式：yyyy-MM-dd
     */
    private String checkOutDate;
    /**
     * 房价码/政策ID
     */
    private String rateCode;
    /**
     * 房间数，必须>=1
     */
    private Integer roomCount;
    /**
     * 成人数  国内：成人数>=1  海外：1<=成人数<=5，视多人价房价码包含人数传输对应人数
     */
    private Integer adults;
    /**
     * 每日房价
     */
    private List<DailyPrice> dailyPriceList;
    /**
     * 是否总对总   0-现付订单  1-总对总订单，包括预付和信用
     */
    private Integer isGroup = 1;
    /**
     * 担保模式  NONE：无  FIRST_NIGHT：首晚担保   FULL_AMOUNT：全额担保
     */
    private String guaranteeMode;
    /**
     * 儿童数
     */
    private Integer childs;
    /**
     * 预计到达时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String arriveTime;
    /**
     * 活动ID，会员价非必填 活动价必填
     */
    private String activityId;
    /**
     * 预订人编号
     */
    private String bookerPersonId;
    /**
     * 预订人姓名
     */
    private String bookerPersonName;
    /**
     * 预订人证件号
     */
    private String bookerPersonIdNumber;
    /**
     * 预订价格类型   个人：PERSON  企业：COMPANY
     */
    private String bookerPriceType;
    /**
     * 纳税人识别号，当是总对总订单并且有多组开票信息时，必传
     */
    private String invoiceNo;
    /**
     * 是否为入住人赠送积分  0-否  1-是
     */
    private Integer isNeedRegisterMember;
    /**
     * 差旅类型  COMPANY：因公  PERSON：因私
     */
    private String travelType;
    /**
     * 差旅档次和级别
     */
    private String travelLevel;
    /**
     * 客人备注
     */
    private String remark;
    /**
     * 透传字段
     */
    private String extend;
    /**
     * 二级分销ID
     */
    private String distributorsId;
    /**
     * 二级分销名称
     */
    private String distributorsName;

    /**
     * 每日房价
     *
     * @author ChenBo
     */
    @Data
    public static class DailyPrice implements Serializable {

        private static final long serialVersionUID = 1L;
        /**
         * 优惠券码
         */
        private String couponNo;
        /**
         * 营业日，格式：yyyy-MM-dd
         */
        private String bizDate;
        /**
         * 门市价
         */
        private Integer marketPrice;
        /**
         * 房价（税后价）
         */
        private Integer afterTaxPrice;
        /**
         * 房费总价
         */
        private Integer totalRoomPrice;
        /**
         * 结算价格
         */
        private Integer settlementPrice;
        /**
         * 结算总价
         */
        private Integer totalSettlementPrice;
    }
}
