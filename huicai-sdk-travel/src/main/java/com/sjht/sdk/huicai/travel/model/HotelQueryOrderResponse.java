package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 查询酒店订单响应参数
 *
 * @author ChenBo
 */
@Data
public class HotelQueryOrderResponse implements Serializable {

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
     * 用户手机号
     */
    private String userMobile;
    /**
     * 订单状态 0-预定中 1-预定完成  2-已入住  3-已离店  10-已完成  20-已取消  21-已取消有部分退款  30-临时挂账  99-NoShow
     */
    private Integer orderStatus;
    /**
     * 退款状态 0-未退款 1-待处理 10-退款中 11-待退款 20-已退款 30-退款失败 40-驳回申请 50-拒绝退款
     */
    private Integer refundStatus;
    /**
     * 开票状态  0-未申请  1-待开票  2-已开票
     */
    private Integer billStatus;
    /**
     * 支付状态  0-待支付  1-已支付
     */
    private Integer payStatus;
    /**
     * 订单支付时间
     */
    private String orderPayTime;
    /**
     * 订单创建时间
     */
    private String orderCreateTime;
    /**
     * 订单退款时间
     */
    private String orderRefundTime;

    //***************预定酒店信息*****************/

    /**
     * 预订人手机号码
     */
    private String bookerPersonMobile;
    /**
     * 酒店ID
     */
    private String hotelId;
    /**
     * 酒店名称
     */
    private String hotelName;
    /**
     * 房型ID
     */
    private String roomId;
    /**
     * 房型名称
     */
    private String roomName;
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
     * 最晚离店日期，格式：yyyy-MM-dd HH:mm:ss
     */
    private String lastCheckOutTime;
    /**
     * 预计到达时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String arriveTime;
    /**
     * 每日房价列表
     */
    private List<DailyPrice> dailyPriceList;
    /**
     * 房价码
     */
    private String rateCode;
    /**
     * 入住码
     */
    private String phraseNo;
    /**
     * 房间数，必须>=1
     */
    private Integer roomCount;
    /**
     * 成人数  国内：成人数>=1  海外：1<=成人数<=5，视多人价房价码包含人数传输对应人数
     */
    private Integer adults;
    /**
     * 儿童数
     */
    private Integer childs;
    /**
     * 订单总金额，单位：分
     */
    private Integer totalAmount;
    /**
     * 用户支付总金额，单位：分
     */
    private Integer payAmount;
    /**
     * 原价格 (不改签与total_amount一致) ，单位：分
     */
    private Integer originalAmount;
    /**
     * 预定状态  0-预定处理中   10-预定完成  20-已取消
     */
    private Integer bookStatus;
    /**
     * 积分状态 0-不是会员 1-未下挂 2-渠道不赠送 3-等待处理 4-积分间夜赠送完成 5-酒店不处理赠送 6-非本人本卡 7-取消订单 8-获取房费为0 则不赠送积分间夜 9-下挂卡已下线 10-订单NOSHWO
     */
    private Integer scoreStatus;
    /**
     * 实际房费，单位：分
     */
    private Integer realRoomPrice;
    /**
     * 实际入住间夜数
     */
    private String realCheckInNight;
    /**
     * 总赠送积分
     */
    private Integer totalScore;
    /**
     * 总累积间夜数
     */
    private String totalNight;
    /**
     * 是否可以取消  0-否  1-是
     */
    private Integer isCanCancel;
    /**
     * 取消政策
     */
    private String cancelDesc;
    /**
     * 最晚取消时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String lastCancelTime;
    /**
     * 最晚保留时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String lastHoldTime;
    /**
     * 活动ID，会员价非必填 活动价必填
     */
    private String activityId;
    /**
     * 预订人编号
     */
    private String bookerPersonId;
    /**
     * 预订价格类型   个人：PERSON  企业：COMPANY
     */
    private String bookerPriceType;
    /**
     * 预订短信是否已发送  0-否  1-是
     */
    private Integer isSendMessage;
    /**
     * 入住政策
     */
    private String checkInPolicyDesc;
    /**
     * 关联号
     */
    private String outerRefId;
    /**
     * 差标金额，单位：分
     */
    private Integer travelMoney;
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
     * 每日房价
     *
     * @author ChenBo
     */
    @Data
    public static class DailyPrice implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 日期
         */
        private String bizDate;
        /**
         * 价格，单位：分
         */
        private Integer afterTaxPrice;
    }
}
