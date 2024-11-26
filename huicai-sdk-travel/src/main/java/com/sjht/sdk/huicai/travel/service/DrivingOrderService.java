package com.sjht.sdk.huicai.travel.service;

import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.travel.model.*;

public class DrivingOrderService extends BaseApiService {

    public DrivingOrderService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 提交订单
     *
     * @param params 请求参数
     * @return 订单号
     */
    public Result<DrivingOrderCommitResponseDto> orderCommit(DrivingOrderCommitRequestDto params) {
        return this.baseClient.execute(ApiUrl.DRIVING_ORDER_COMMIT, params, DrivingOrderCommitResponseDto.class);
    }

    /**
     * 取消订单
     *
     * @param params 请求参数
     * @return 取消结果
     */
    public Result<DrivingOrderCancelResponseDto> orderCancel(DrivingOrderCancelRequestDto params) {
        return this.baseClient.execute(ApiUrl.DRIVING_ORDER_CANCEL, params, DrivingOrderCancelResponseDto.class);
    }

    /**
     * 订单查询
     *
     * @param params 订单号
     * @return 订单详情
     */
    public Result<DrivingOrderQueryResponseDto> orderQuery(DrivingOrderQueryRequestDto params) {
        return this.baseClient.execute(ApiUrl.DRIVING_ORDER_QUERY, params, DrivingOrderQueryResponseDto.class);
    }

    /**
     * 订单轨迹查询
     *
     * @param params 订单号
     * @return 订单轨迹信息
     */
    public Result<DrivingOrderTraceQueryResponseDto> orderTraceQuery(DrivingOrderQueryRequestDto params) {
        return this.baseClient.execute(ApiUrl.DRIVING_ORDER_TRACE_QUERY, params, DrivingOrderTraceQueryResponseDto.class);
    }

    /**
     * 订单费用明细查询
     *
     * @param params 订单号
     * @return 订单费用明细
     */
    public Result<DrivingOrderFeeDetailQueryResponseDto> orderFeeDetailQuery(DrivingOrderQueryRequestDto params) {
        return this.baseClient.execute(ApiUrl.DRIVING_ORDER_FEE_DETAIL_QUERY, params, DrivingOrderFeeDetailQueryResponseDto.class);
    }

    /**
     * 订单取消费用查询
     *
     * @param params 订单号
     * @return 订单费用明细
     */
    public Result<DrivingOrderCancelFeeQueryResponseDto> orderCancelFeeQuery(DrivingOrderQueryRequestDto params) {
        return this.baseClient.execute(ApiUrl.DRIVING_ORDER_CANCEL_FEE_QUERY, params, DrivingOrderCancelFeeQueryResponseDto.class);
    }

    /**
     * 订单线上支付成功通知
     *
     * @param params 支付请求参数
     * @return 支付通知处理结果
     */
    public Result<DrivingOrderPayedResponseDto> orderPayed(DrivingOrderPayedRequestDto params) {
        return this.baseClient.execute(ApiUrl.DRIVING_ORDER_PAYED, params, DrivingOrderPayedResponseDto.class);
    }
}
