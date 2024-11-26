package com.sjht.sdk.huicai.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 公共返回参数
 *
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {

    private Integer code = 200;

    private String msg = "操作成功";
    /**
     * 返回数据
     */
    private T data;

    /**
     * 总记录数
     */
    private Long total;

}
