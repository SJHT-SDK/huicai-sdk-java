package com.sjht.sdk.huicai.core.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * API配置
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HuicaiApiConfig implements Serializable {

    private static final long serialVersionUID = -1;

    /**
     * 服务域名
     */
    private String serverUrl = "https://open.sjht.com";
    /**
     * AppId
     */
    private String appId;
    /**
     * App秘钥
     */
    private String appSecret;
    /**
     * 参数加密秘钥
     */
    private String encryptSecretKey;
    /**
     * 日志开关，默认关闭
     */
    private Boolean logWitch = false;
}
