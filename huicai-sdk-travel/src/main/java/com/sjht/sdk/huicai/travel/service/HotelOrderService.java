package com.sjht.sdk.huicai.travel.service;

import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.core.utils.OrderUtils;
import com.sjht.sdk.huicai.travel.model.*;

import java.util.List;

/**
 * 酒店订单服务
 *
 * @author ChenBo
 */
public class HotelOrderService extends BaseApiService {

    public HotelOrderService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 下单前验证是否可定指定房型
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<HotelCheckAvailabilityResponse> checkAvailability(HotelCheckAvailabilityRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_CHECK_AVAILABILITY, request, HotelCheckAvailabilityResponse.class);
    }

    /**
     * 创建酒店订单
     *
     * @param request 请求参数
     * @return 订单号
     */
    public Result<HotelCreateOrderResponse> createOrder(HotelCreateOrderRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_CREATE, request, HotelCreateOrderResponse.class);
    }

    /**
     * 取消订单
     *
     * @param request 订单号
     * @return 处理结果
     */
    public Result<HotelOrderResultResponse> cancelOrder(HotelOrderCancelRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_CANCEL, request, HotelOrderResultResponse.class);
    }

    /**
     * 查询订单
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 订单详情
     */
    public Result<HotelQueryOrderResponse> queryOrder(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_QUERY, OrderUtils.verifyOrderNo(orderNo, appOrderNo), HotelQueryOrderResponse.class);
    }

    /**
     * 获取入住码
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 入住码
     */
    public Result<HotelQueryOrderPhraseNoResponse> queryOrderPhraseNo(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_QUERY_PHRASE_NO, OrderUtils.verifyOrderNo(orderNo, appOrderNo), HotelQueryOrderPhraseNoResponse.class);
    }

    /**
     * 新建超时取消/提前离店申请单
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<HotelOrderResultResponse> orderRefundAndChangeApply(HotelOrderRefundAndChangeApplyRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_REFUND_CHANGE_APPLY, request, HotelOrderResultResponse.class);
    }

    /**
     * 撤销取消单/提前离店申请
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<HotelOrderResultResponse> orderRefundAndChangeRevocation(HotelOrderRefundAndChangeRevocationRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_REFUND_CHANGE_REVOCATION, request, HotelOrderResultResponse.class);
    }

    /**
     * 酒店订单查询取消/提前离店申请单详情
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<List<HotelQueryOrderRefundAndChangeDetailResponse>> queryOrderRefundAndChangeDetail(HotelQueryOrderRefundAndChangeDetailRequest request) {
        return this.baseClient.executeToList(ApiUrl.HOTEL_ORDER_QUERY_REFUND_CHANGE_DETAIL, request, HotelQueryOrderRefundAndChangeDetailResponse.class);
    }

    /**
     * 提前离店预审
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<HotelOrderDiscrepantInfoResponse> checkDiscrepantEarlyDeparture(HotelOrderCheckDiscrepantEarlyDepartureRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_CHECK_DISCREPANT_EARLY_DEPARTURE, request, HotelOrderDiscrepantInfoResponse.class);
    }

    /**
     * 查询实际入住信息
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 响应参数
     */
    public Result<HotelOrderCheckInInfoResponse> queryOrderCheckInInfo(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.HOTEL_ORDER_CHECK_DISCREPANT_EARLY_DEPARTURE, OrderUtils.verifyOrderNo(orderNo, appOrderNo), HotelOrderCheckInInfoResponse.class);
    }
}
