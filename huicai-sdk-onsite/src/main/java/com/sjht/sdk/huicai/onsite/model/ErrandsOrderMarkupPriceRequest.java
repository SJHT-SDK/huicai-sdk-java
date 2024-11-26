package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单加价
 *
 * @author ChenBo
 */
@Data
public class ErrandsOrderMarkupPriceRequest implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号
     */
    private String appOrderNo;
    /**
     * 加价金额，单位：分，只传递增加金额的部分，只能传递被100整除的数字，200即2元，最大值为10000
     */
    private Integer additionAmount;
}
