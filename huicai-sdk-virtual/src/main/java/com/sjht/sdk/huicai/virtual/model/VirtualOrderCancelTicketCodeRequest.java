package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 商家自发券或福卡券码订单退款取消作废请求参数
 *
 * @author ChenBo
 */
@Data
public class VirtualOrderCancelTicketCodeRequest implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单
     */
    private String appOrderNo;
//    /**
//     * 核销券码
//     */
//    private String cardNo;

    /**
     * 作废原因
     */
    private String recedeExplain;
}
