package com.sjht.sdk.huicai.h5.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 开放登录请求参数
 *
 * @author ChenBo
 */
@Data
public class H5AuthLoginRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 手机号
     */
    private String phone;
    /**
     * 微信OpenId
     */
    private String wxOpenId;
    /**
     * 二级分销ID
     */
    private String distributorsId;
    /**
     * 二级分销名称
     */
    private String distributorsName;
}
