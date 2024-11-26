package com.sjht.sdk.huicai.virtual.service;

import com.alibaba.fastjson.JSONObject;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.core.utils.OrderUtils;
import com.sjht.sdk.huicai.virtual.model.*;

/**
 * 虚拟数字权益订单服务
 *
 * @author ChenBo
 */
public class VirtualOrderService extends BaseApiService {

    public VirtualOrderService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 创建数字权益订单
     *
     * @param request 请求创建订单信息
     * @return 订单号
     */
    public Result<VirtualOrderCreateResponse> create(VirtualOrderCreateRequest request) {
        return this.baseClient.execute(ApiUrl.VIRTUAL_ORDER_CREATE, request, VirtualOrderCreateResponse.class);
    }

    /**
     * 数字权益订单详情查询
     *
     * @param orderNo    世纪恒通订单号
     * @param appOrderNo 接入方业务系统内部订单号
     * @return 订单详情
     */
    public Result<VirtualOrderDetailsResponse> getDetails(String orderNo, String appOrderNo) {
        return this.baseClient.execute(ApiUrl.VIRTUAL_ORDER_DETAILS, OrderUtils.verifyOrderNo(orderNo, appOrderNo), VirtualOrderDetailsResponse.class);
    }

    /**
     * 生成券码核销或绑定的二维码
     *
     * @param orderNo 世纪恒通订单号
     * @param cardNo  券码
     * @return 核销二维码信息
     */
    public Result<VirtualOrderVerifyQrCodeResponse> getVerifyQrCode(String orderNo, String cardNo) {
        if (orderNo == null || orderNo.isEmpty()) {
            throw new RuntimeException("世纪恒通订单号不能为空");
        }
        if (cardNo == null || cardNo.isEmpty()) {
            throw new RuntimeException("券码不能为空");
        }
        JSONObject request = new JSONObject();
        request.put("orderNo", orderNo);
        request.put("cardNo", cardNo);
        return this.baseClient.execute(ApiUrl.VIRTUAL_ORDER_VERIFY_QR_CODE, request, VirtualOrderVerifyQrCodeResponse.class);
    }

    /**
     * 恒通自发券或福卡券码订单退款取消作废
     *
     * @param request 订单号
     * @return 作废券码
     */
    public Result<VirtualOrderCancelTicketCodeResponse> cancelTicketCode(VirtualOrderCancelTicketCodeRequest request) {
        return this.baseClient.execute(ApiUrl.VIRTUAL_ORDER_CANCEL_TICKET_CODE, request, VirtualOrderCancelTicketCodeResponse.class);
    }
}
