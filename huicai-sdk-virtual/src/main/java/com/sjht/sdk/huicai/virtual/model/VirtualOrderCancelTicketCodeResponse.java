package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 商家自发券或福卡券码订单退款取消作废请求参数
 *
 * @author ChenBo
 */
@Data
public class VirtualOrderCancelTicketCodeResponse implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 二维码Base64图片信息
     */
    private String[] ticketList;
}
