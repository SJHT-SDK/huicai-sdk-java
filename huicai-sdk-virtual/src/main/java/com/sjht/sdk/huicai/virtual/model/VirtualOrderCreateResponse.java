package com.sjht.sdk.huicai.virtual.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 创建虚拟订单返回参数
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VirtualOrderCreateResponse implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 接入方业务系统内部订单号，只能是数字、大小写字母_-*，且在同一个AppId下唯一
     */
    private String appOrderNo;
    /**
     * 充值状态  0-待处理  1-充值成功  2-充值失败  3-充值中
     */
    private Integer rechargeStatus;
}
