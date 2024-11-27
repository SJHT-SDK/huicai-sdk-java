package com.sjht.sdk.huicai.travel.service;

import com.alibaba.fastjson2.JSONObject;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.core.utils.OrderUtils;
import com.sjht.sdk.huicai.travel.model.*;

import java.util.List;


public class TaxiOrderService extends BaseApiService {

    public TaxiOrderService(HuicaiApiClient baseClient) {
        super(baseClient);
    }


    /**
     * 查询预估价
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<TaxiQueryEstimatedPriceResponse> queryEstimatedPrice(TaxiQueryEstimatedPriceRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_QUERY_ESTIMATED_PRICE, params, TaxiQueryEstimatedPriceResponse.class);
    }

    /**
     * 创建订单
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<TaxiCreateOrderResponse> createOrder(TaxiCreateOrderRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_CREATE, params, TaxiCreateOrderResponse.class);
    }

    /**
     * 获取订单取消费用
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 响应参数
     */
    public Result<TaxiQueryCancelFeeResponse> queryCancelFee(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_QUERY_CANCEL_FEE, OrderUtils.verifyOrderNo(orderNo, appOrderNo), TaxiQueryCancelFeeResponse.class);
    }

    /**
     * 取消订单
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<TaxiCancelOrderResponse> cancelOrder(TaxiCancelOrderRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_CANCEL, params, TaxiCancelOrderResponse.class);
    }

    /**
     * 查询订单详情
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 响应参数
     */
    public Result<TaxiQueryOrderDetailsResponse> queryOrderDetails(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_DETAILS, OrderUtils.verifyOrderNo(orderNo, appOrderNo), TaxiQueryOrderDetailsResponse.class);
    }

    /**
     * 获取司机实时位置
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 响应参数
     */
    public Result<TaxiDriverLocationResponse> queryDriverLocation(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_QUERY_DRIVER_LOCATION, OrderUtils.verifyOrderNo(orderNo, appOrderNo), TaxiDriverLocationResponse.class);
    }

    /**
     * 修改起点询价（仅限即时单，预约单不支持）
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<TaxiModifyOriginEstimateResponse> modifyOriginEstimate(TaxiModifyOriginEstimateRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_MODIFY_ORIGIN_ESTIMATE, params, TaxiModifyOriginEstimateResponse.class);
    }

    /**
     * 修改起点确认（仅限即时单，预约单不支持）
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<Void> modifyOriginConfirm(TaxiModifyOriginConfirmRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_MODIFY_ORIGIN_CONFIRM, params, Void.class);
    }

    /**
     * 修改目的地询价（仅限即时订单，预约单暂不支持）
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<TaxiModifyDestEstimateResponse> modifyDestEstimate(TaxiModifyDestEstimateRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_MODIFY_DEST_ESTIMATE, params, TaxiModifyDestEstimateResponse.class);
    }

    /**
     * 修改目的地确认（仅限即时订单，预约单暂不支持）
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<Void> modifyDestConfirm(TaxiModifyDestConfirmRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_MODIFY_DEST_CONFIRM, params, Void.class);
    }

    /**
     * 司机规划接驾、送驾路线查询（仅限即时订单，预约单暂不支持）
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<TaxiOrderPlanTrackResponse> queryOrderPlanTrack(TaxiOrderPlanTrackRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_QUERY_ORDER_PLAN_TRACK, params, TaxiOrderPlanTrackResponse.class);
    }

    /**
     * 支付通知
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<TaxiOrderPayResponse> orderPay(TaxiOrderPayRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_PAY, params, TaxiOrderPayResponse.class);
    }

    /**
     * 订单计费轨迹查询
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 响应参数
     */
    public Result<TaxiQueryOrderTrackResponse> queryOrderTrack(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_QUERY_ORDER_TRACK, OrderUtils.verifyOrderNo(orderNo, appOrderNo), TaxiQueryOrderTrackResponse.class);
    }

    /**
     * 查询附近司机
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<List<TaxiNearbyDriverResponse>> queryNearbyDriver(TaxiNearbyDriverRequest params) {
        return this.baseClient.executeToList(ApiUrl.TAXI_ORDER_QUERY_NEARBY_DRIVER, params, TaxiNearbyDriverResponse.class);
    }

    /**
     * 渠道决策通知
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<Boolean> decisionNotify(TaxiDecisionNotifyRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_ORDER_QUERY_DECISION_NOTIFY, params, Boolean.class);
    }

    /**
     * 申请开发票
     *
     * @param params 请求参数
     * @return 响应参数
     */
    public Result<TaxiCreateInvoiceResponse> createInvoice(TaxiCreateInvoiceRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_INVOICE_CREATE, params, TaxiCreateInvoiceResponse.class);
    }

    /**
     * 查询发票
     *
     * @param invoiceId 发票ID
     * @return 响应参数
     */
    public Result<TaxiQueryInvoiceResponse> queryInvoiceInfo(String invoiceId) {
        JSONObject request = new JSONObject();
        request.put("invoiceId", invoiceId);
        return this.baseClient.execute(ApiUrl.TAXI_INVOICE_QUERY, request, TaxiQueryInvoiceResponse.class);
    }

    /**
     * 重开发票
     *
     * @param invoiceId 发票ID
     * @param email     接收邮箱
     * @return 响应参数
     */
    public Result<Void> resendInvoice(String invoiceId, String email) {
        JSONObject request = new JSONObject();
        request.put("invoiceId", invoiceId);
        request.put("email", email);
        return this.baseClient.execute(ApiUrl.TAXI_INVOICE_RESEND, request, Void.class);
    }

    /**
     * 创建工单
     *
     * @param params 创建工单请求参数
     * @return 世纪恒通客诉工单号
     */
    public Result<JSONObject> createComplaint(TaxiCreateComplaintRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_COMPLAINT_CREATE, params, JSONObject.class);
    }

    /**
     * 更新工单
     *
     * @param params 创建工单请求参数
     * @return 世纪恒通客诉工单号
     */
    public Result<JSONObject> updateComplaint(TaxiUpdateComplaintRequest params) {
        return this.baseClient.execute(ApiUrl.TAXI_COMPLAINT_CREATE, params, JSONObject.class);
    }

    /**
     * 催促工单
     *
     * @param complaintNo 世纪恒通客诉工单号
     * @return 世纪恒通客诉工单号
     */
    public Result<Void> urgeComplaint(String complaintNo) {
        JSONObject request = new JSONObject();
        request.put("complaintNo", complaintNo);
        return this.baseClient.execute(ApiUrl.TAXI_INVOICE_RESEND, request, Void.class);
    }
}
