package com.sjht.sdk.huicai.onsite.service;

import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.core.utils.OrderUtils;
import com.sjht.sdk.huicai.onsite.model.*;

import java.util.List;

/**
 * 家政服务
 *
 * @author ChenBo
 */
public class HomemakingService extends BaseApiService {

    public HomemakingService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 查询可预约时间
     *
     * @param request 请求参数
     *                timeslot表示以15分钟为单位进行分割，以00:00开始计算,总共96位,只有位置为1的时间段内才表示可以预约. 0:不可预约 1:可以预约
     * @return 响应参数
     */
    public Result<List<HomemakingQueryAvailableTimeslotsResponse>> queryAvailableTimeslots(HomemakingQueryAvailableTimeslotsRequest request) {
        return this.baseClient.executeToList(ApiUrl.HOMEMAKING_QUERY_AVAILABLE_TIMESLOTS, request, HomemakingQueryAvailableTimeslotsResponse.class);
    }

    /**
     * 创建订单
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<HomemakingCreateOrderResponse> createOrder(HomemakingCreateOrderRequest request) {
        return this.baseClient.execute(ApiUrl.HOMEMAKING_CREATE_ORDER, request, HomemakingCreateOrderResponse.class);
    }

    /**
     * 订单支付
     *
     * @param request 请求参数
     */
    public Result<Void> payOrder(HomemakingPayOrderRequest request) {
        return this.baseClient.execute(ApiUrl.HOMEMAKING_PAY_ORDER, request, Void.class);
    }

    /**
     * 订单查询
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 响应参数
     */
    public Result<HomemakingQueryOrderResponse> queryOrder(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.PHYSICAL_ORDER_DETAILS, OrderUtils.verifyOrderNo(orderNo, appOrderNo), HomemakingQueryOrderResponse.class);
    }

    /**
     * 取消订单
     *
     * @param request 请求参数
     */
    public Result<Void> cancelOrder(HomemakingCancelOrderRequest request) {
        return this.baseClient.execute(ApiUrl.HOMEMAKING_PAY_ORDER, request, Void.class);
    }
}
