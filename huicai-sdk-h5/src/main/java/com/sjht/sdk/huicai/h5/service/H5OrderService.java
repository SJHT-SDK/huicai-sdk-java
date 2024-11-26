package com.sjht.sdk.huicai.h5.service;

import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.h5.model.H5QueryOrderRequest;
import com.sjht.sdk.huicai.h5.model.H5QueryOrderResponse;

public class H5OrderService extends BaseApiService {

    public H5OrderService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * H5订单查询
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<H5QueryOrderResponse> queryOrderDetails(H5QueryOrderRequest request) {
        return this.baseClient.execute(ApiUrl.H5_ORDER_QUERY, request, H5QueryOrderResponse.class);
    }

}
