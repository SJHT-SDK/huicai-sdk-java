package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 生成虚拟订单门店核销二维码响应参数
 *
 * @author ChenBo
 */
@Data
public class VirtualOrderVerifyQrCodeResponse implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 世纪恒通订单号
     */
    private String orderNo;
    /**
     * 二维码Base64图片信息
     */
    private String qrCode;
    /**
     * 二维码过期时间戳
     */
    private String timestamp;
}
