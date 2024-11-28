package com.sjht.sdk.huicai.core.service;

/**
 * 荟采回调通知处理
 *
 * @author ChenBo
 */
public interface HuicaiCallBackHandleInterface<T> {

    default void fail() {
    }

    void success(T params);
}
