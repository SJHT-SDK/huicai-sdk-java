package com.sjht.sdk.huicai.h5.model;

import lombok.Data;

import java.io.Serializable;

/**
 * H5订单查询请求参数
 *
 * @author ChenBo
 */
@Data
public class H5QueryOrderRequest implements Serializable {

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
}
