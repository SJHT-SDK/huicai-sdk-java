package com.sjht.sdk.huicai.h5.service;

import com.alibaba.fastjson2.JSONObject;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.h5.model.H5AuthLoginRequest;
import com.sjht.sdk.huicai.h5.model.H5AuthLoginResponse;

/**
 * 荟采商城H5免登服务
 *
 * @author ChenBo
 */
public class H5AuthService extends BaseApiService {

    public H5AuthService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 登录
     *
     * @param request 请求参数
     * @return 登录用户信息
     */
    public Result<H5AuthLoginResponse> login(H5AuthLoginRequest request) {
        return this.baseClient.execute(ApiUrl.H5_AUTH_LOGIN, request, H5AuthLoginResponse.class);
    }

    /**
     * 刷新AccessToken
     *
     * @param refreshToken 刷新token
     * @return AccessToken
     */
    public Result<H5AuthLoginResponse> refreshAccessToken(String refreshToken) {
        JSONObject request = new JSONObject();
        request.put("refreshToken", refreshToken);
        return this.baseClient.execute(ApiUrl.H5_AUTH_REFRESH_ACCESS_TOKEN, request, H5AuthLoginResponse.class);
    }

}
