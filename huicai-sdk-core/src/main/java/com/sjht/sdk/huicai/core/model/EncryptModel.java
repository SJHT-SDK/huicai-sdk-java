package com.sjht.sdk.huicai.core.model;

import com.alibaba.fastjson2.JSON;
import com.sjht.sdk.huicai.core.utils.ThreeDesUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共返回参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncryptModel {

    /**
     * 密文
     */
    private String ciphertext;

    public static <T> EncryptModel success(Result<T> result, String encryptSecretKey) {
        String ciphertext;
        try {
            ciphertext = ThreeDesUtils.encode(JSON.toJSONString(result), encryptSecretKey);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new EncryptModel(ciphertext);
    }
}
