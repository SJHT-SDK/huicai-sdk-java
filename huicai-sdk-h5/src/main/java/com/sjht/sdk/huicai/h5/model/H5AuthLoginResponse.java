package com.sjht.sdk.huicai.h5.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 开放登录相应参数
 *
 * @author ChenBo
 */
@Data
public class H5AuthLoginResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户token
     */
    private String accessToken;
    /**
     * 用户token过期时间
     */
    private Integer expiresIn = -1;
    /**
     * 刷新token
     */
    private String refreshToken;
    /**
     * 重定向跳转地址
     */
    private String redirectUrl;
}
