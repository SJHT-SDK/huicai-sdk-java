package com.sjht.sdk.huicai.onsite.service;

import com.alibaba.fastjson2.JSONObject;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.core.utils.OrderUtils;
import com.sjht.sdk.huicai.onsite.model.*;

import java.util.List;

/**
 * 跑腿服务
 *
 * @author ChenBo
 */
public class RunningErrandsService extends BaseApiService {

    public RunningErrandsService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 查询开通城市
     *
     * @param skuId 世纪恒通SKU ID
     * @return 响应参数
     */
    public Result<List<ErrandsOpenCityResponse>> openCityList(String skuId) {
        JSONObject request = new JSONObject();
        request.put("skuId", skuId);
        return this.baseClient.executeToList(ApiUrl.ERRANDS_OPEN_CITY_LIST, request, ErrandsOpenCityResponse.class);
    }

    /**
     * 订单计费查询
     *
     * @param request 请求参数
     * @return 返回参数
     */
    public Result<ErrandsOrderCalculateResponse> orderCalculate(ErrandsOrderCalculateRequest request) {
        return this.baseClient.execute(ApiUrl.ERRANDS_ORDER_CALCULATE, request, ErrandsOrderCalculateResponse.class);
    }

    /**
     * 创建订单
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<ErrandsCreateOrderResponse> createOrder(ErrandsCreateOrderRequest request) {
        return this.baseClient.execute(ApiUrl.ERRANDS_CREATE_ORDER, request, ErrandsCreateOrderResponse.class);
    }

    /**
     * 订单查询
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 响应参数
     */
    public Result<ErrandsQueryOrderResponse> queryOrder(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.ERRANDS_QUERY_ORDER, OrderUtils.verifyOrderNo(orderNo, appOrderNo), ErrandsQueryOrderResponse.class);
    }

    /**
     * 订单加价
     *
     * @param request 请求参数
     */
    public Result<Void> orderMarkupPrice(ErrandsOrderMarkupPriceRequest request) {
        return this.baseClient.execute(ApiUrl.ERRANDS_ORDER_MARKUP_PRICE, request, Void.class);
    }

    /**
     * 查询订单取消费用
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 响应参数
     */
    public Result<ErrandsQueryOrderCancelFeeResponse> queryOrderCancelFee(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.ERRANDS_QUERY_ORDER_CANCEL_FEE, OrderUtils.verifyOrderNo(orderNo, appOrderNo), ErrandsQueryOrderCancelFeeResponse.class);
    }

    /**
     * 取消订单
     *
     * @param request 请求参数
     */
    public Result<Void> cancelOrder(ErrandsCancelOrderRequest request) {
        return this.baseClient.execute(ApiUrl.ERRANDS_CANCEL_ORDER, request, Void.class);
    }

    /**
     * 确认物品送回
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     */
    public Result<Void> confirmGoodsReturn(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.ERRANDS_CONFIRM_GOODS_RETURN, OrderUtils.verifyOrderNo(orderNo, appOrderNo), Void.class);
    }

    /**
     * 查询订单续重加价金额
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<ErrandsOrderAddWeightFeeResponse> calculateOrderAddWeightFee(ErrandsOrderAddWeightFeeRequest request) {
        return this.baseClient.execute(ApiUrl.ERRANDS_CALCULATE_ORDER_ADD_WEIGHT_FEE, request, ErrandsOrderAddWeightFeeResponse.class);
    }

    /**
     * 支付订单续重费用
     *
     * @param request 请求参数
     */
    public Result<Void> payAddWeightFee(ErrandsOrderPayAddWeightFeeRequest request) {
        return this.baseClient.execute(ApiUrl.ERRANDS_PAY_ADD_WEIGHT_FEE, request, Void.class);
    }
}
