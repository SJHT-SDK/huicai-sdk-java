package com.sjht.sdk.huicai.h5.model;

import lombok.Data;

import java.io.Serializable;

/**
 * H5订单查询响应参数
 *
 * @author ChenBo
 */
@Data
public class H5QueryOrderResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务模块
     * VIRTUAL：虚拟数字权益
     * PHYSICAL：实物
     * DRIVING：代驾
     * HOTEL：酒店
     * HOMEMAKING：家政服务
     * RUNNING_ERRANDS：跑腿服务
     */
    private String module;
    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 用户手机号
     */
    private String userMobile;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品数量
     */
    private Integer goodsCount;
    /**
     * 商品图片URL
     */
    private String goodsCover;
    /**
     * 订单总金额，单位：分
     */
    private Integer totalAmount;
    /**
     * 实付总金额，单位：分
     */
    private Integer actualPaymentAmount;
    /**
     * 客户结算总金额，单位：分
     */
    private Integer settlementAmount;
    /**
     * 二级分销ID
     */
    private String distributorsId;
    /**
     * 二级分销名称
     */
    private String distributorsName;
    /**
     * 订单详情信息，各模块订单详情字段请查看附录。
     */
    private Object orderInfo;
}
