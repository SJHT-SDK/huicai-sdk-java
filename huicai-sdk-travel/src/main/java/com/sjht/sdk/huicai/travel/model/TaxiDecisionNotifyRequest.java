package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 渠道决策通知
 *
 * @author ChenBo
 */
@Data
public class TaxiDecisionNotifyRequest implements Serializable {

    private static final long serialVersionUID = -3183669969163003828L;

    /**
     * 订单编号
     * 是否必填 是
     */
    private String orderNo;
    /**
     * 客户订单编号
     */
    private String appOrderNo;

    /**
     * 抢单结果 1：成功 0：失败 仅即时单支持决策失败，预约单仅决策成功时调用，决策失败调用取消接口
     * 是否必填 是
     */
    private Integer striveStatus;
    /**
     * 抢单失败原因，当抢单结果为0时必传
     * 是否必填 是
     */
    private String striveFailReason;

}
