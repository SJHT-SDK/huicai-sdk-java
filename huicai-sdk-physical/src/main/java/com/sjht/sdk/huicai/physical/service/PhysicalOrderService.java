package com.sjht.sdk.huicai.physical.service;

import com.alibaba.fastjson.JSONObject;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.core.utils.OrderUtils;
import com.sjht.sdk.huicai.physical.model.*;

/**
 * 实物订单服务
 *
 * @author ChenBo
 */
public class PhysicalOrderService extends BaseApiService {

    public PhysicalOrderService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 创建实物订单
     *
     * @param request 请求参数
     * @return 订单号
     */
    public Result<PhysicalOrderCreateResponse> create(PhysicalOrderCreateRequest request) {
        return this.baseClient.execute(ApiUrl.PHYSICAL_ORDER_CREATE, request, PhysicalOrderCreateResponse.class);
    }

    /**
     * 取消订单退款申请
     *
     * @param request 请求参数
     * @return 退款单号
     */
    public Result<PhysicalOrderRefundResponse> refundApply(PhysicalOrderRefundRequest request) {
        return this.baseClient.execute(ApiUrl.PHYSICAL_ORDER_REFUND_APPLY, request, PhysicalOrderRefundResponse.class);
    }

    /**
     * 实物订单详情查询
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 订单详情
     */
    public Result<PhysicalOrderDetailsResponse> getDetails(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.PHYSICAL_ORDER_DETAILS, OrderUtils.verifyOrderNo(orderNo, appOrderNo), PhysicalOrderDetailsResponse.class);
    }

    /**
     * 实物订单物流查询
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 实物订单物流信息
     */
    public Result<PhysicalOrderExpressDeliveryResponse> getExpressDelivery(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.PHYSICAL_ORDER_EXPRESS_DELIVERY, OrderUtils.verifyOrderNo(orderNo, appOrderNo), PhysicalOrderExpressDeliveryResponse.class);
    }

    /**
     * 实物订单确认收货
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方订单号
     * @return 确认结果
     */
    public Result<Void> confirmReceipt(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.PHYSICAL_ORDER_CONFIRM_RECEIPT, OrderUtils.verifyOrderNo(orderNo, appOrderNo), Void.class);
    }

    /**
     * 订单商品回寄
     *
     * @param request 请求参数
     * @return 结果
     */
    public Result<Void> returnGoods(PhysicalOrderReturnGoodsRequest request) {
        return this.baseClient.execute(ApiUrl.PHYSICAL_ORDER_CONFIRM_RECEIPT, request, Void.class);
    }
}
