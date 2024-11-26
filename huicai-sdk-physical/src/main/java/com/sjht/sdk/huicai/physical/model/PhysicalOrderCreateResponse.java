package com.sjht.sdk.huicai.physical.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建实物订单
 *
 * @author ChenBo
 */
@Data
public class PhysicalOrderCreateResponse implements Serializable {
    /**
     * 供应商系统订单号
     */
    private String orderNo;
    /**
     * 业务系统内部订单号
     */
    private String appOrderNo;
}
