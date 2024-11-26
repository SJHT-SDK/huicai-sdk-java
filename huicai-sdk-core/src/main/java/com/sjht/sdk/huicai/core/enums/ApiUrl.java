package com.sjht.sdk.huicai.core.enums;

import lombok.Getter;

/**
 * API枚举
 *
 * @author ChenBo
 */
@Getter
public enum ApiUrl {

    VIRTUAL_GOODS_PAGE_LIST("查询虚拟数字权益商品列表", "/virtual/goods/pageList"),
    VIRTUAL_GOODS_DETAILS("查询虚拟数字权益商品详情", "/virtual/goods/details"),
    VIRTUAL_GOODS_SKU_STOCK_PRICE("查询虚拟数字权益商品SKU库存及价格", "/virtual/goods/skuStockPrice"),
    VIRTUAL_GOODS_COUPON_SHOP_LIST("根据SKU ID分页查询适用门店", "/virtual/goods/getMerchantCouponShopList"),
    VIRTUAL_ORDER_CREATE("创建数字权益订单", "/virtual/order/create"),
    VIRTUAL_ORDER_DETAILS("数字权益订单详情查询", "/virtual/order/getDetails"),
    VIRTUAL_ORDER_VERIFY_QR_CODE("生成券码核销或绑定的二维码", "/virtual/order/getVerifyQrCode"),
    VIRTUAL_ORDER_CANCEL_TICKET_CODE("恒通自发券或福卡券码订单退款取消作废", "/virtual/order/cancelTicketCode"),

    PHYSICAL_GOODS_PAGE_LIST("查询实物商品列表", "/physical/goods/pageList"),
    PHYSICAL_GOODS_DETAILS("查询实物商品详情", "/physical/goods/details"),
    PHYSICAL_GOODS_SKU_STOCK_PRICE("查询实物商品SKU库存及价格", "/physical/goods/skuStockPrice"),
    PHYSICAL_ORDER_CREATE("创建实物订单", "/physical/order/create"),
    PHYSICAL_ORDER_REFUND_APPLY("取消订单退款申请", "/physical/order/refundApply"),
    PHYSICAL_ORDER_DETAILS("实物订单详情查询", "/physical/order/getDetails"),
    PHYSICAL_ORDER_EXPRESS_DELIVERY("实物订单物流查询", "/physical/order/getExpressDelivery"),
    PHYSICAL_ORDER_CONFIRM_RECEIPT("实物订单确认收货", "/physical/order/confirmReceipt"),
    PHYSICAL_ORDER_RETURN_GOODS("订单商品回寄", "/physical/order/returnGoods"),

    HOTEL_LIST("查询酒店列表", "/smartTravel/hotel/getHotelList"),
    HOTEL_DETAILS("查询酒店详情", "/smartTravel/hotel/getHotelDetails"),
    HOTEL_ROOM_PRICE("查询酒店列表", "/smartTravel/hotel/getHotelRoomPrice"),
    HOTEL_ORDER_CHECK_AVAILABILITY("酒店下单前验证是否可定指定房型", "/smartTravel/hotel/order/checkAvailability"),
    HOTEL_ORDER_CREATE("创建酒店订单", "/smartTravel/hotel/order/createOrder"),
    HOTEL_ORDER_CANCEL("取消酒店订单", "/smartTravel/hotel/order/cancelOrder"),
    HOTEL_ORDER_QUERY("查询酒店订单", "/smartTravel/hotel/order/queryOrder"),
    HOTEL_ORDER_QUERY_PHRASE_NO("获取酒店订单入住码", "/smartTravel/hotel/order/queryOrderPhraseNo"),
    HOTEL_ORDER_REFUND_CHANGE_APPLY("新建超时取消/提前离店申请单", "/smartTravel/hotel/order/orderRefundAndChangeApply"),
    HOTEL_ORDER_REFUND_CHANGE_REVOCATION("撤销取消单/提前离店申请", "/smartTravel/hotel/order/orderRefundAndChangeRevocation"),
    HOTEL_ORDER_QUERY_REFUND_CHANGE_DETAIL("酒店订单查询取消/提前离店申请单详情", "/smartTravel/hotel/order/queryOrderRefundAndChangeDetail"),
    HOTEL_ORDER_CHECK_DISCREPANT_EARLY_DEPARTURE("提前离店预审", "/smartTravel/hotel/order/checkDiscrepantEarlyDeparture"),
    HOTEL_ORDER_QUERY_CHECK_IN("查询实际入住信息", "/smartTravel/hotel/order/queryOrderCheckInInfo"),

    DRIVING_ORDER_COMMIT("代驾用户下单", "/smartTravel/driving/orderCommit"),
    DRIVING_ORDER_CANCEL("代驾用户取消订单", "/smartTravel/driving/orderCancel"),
    DRIVING_ORDER_QUERY("代驾订单查询", "/smartTravel/driving/orderQuery"),
    DRIVING_ORDER_TRACE_QUERY("代驾订单轨迹查询", "/smartTravel/driving/orderTraceQuery"),
    DRIVING_ORDER_FEE_DETAIL_QUERY("代驾订单费用明细查询", "/smartTravel/driving/orderFeeDetailQuery"),
    DRIVING_ORDER_CANCEL_FEE_QUERY("代驾订单取消费用查询", "/smartTravel/driving/orderCancelFeeQuery"),
    DRIVING_ORDER_PAYED("代驾订单线上支付成功通知", "/smartTravel/driving/orderPayed"),

    TAXI_ORDER_QUERY_ESTIMATED_PRICE("打车查询预估价", "/smartTravel/taxi/order/queryEstimatedPrice"),
    TAXI_ORDER_CREATE("打车创建订单", "/smartTravel/taxi/order/createOrder"),
    TAXI_ORDER_QUERY_CANCEL_FEE("获取订单取消费用", "/smartTravel/taxi/order/queryCancelFee"),
    TAXI_ORDER_CANCEL("取消订单", "/smartTravel/taxi/order/cancelOrder"),
    TAXI_ORDER_DETAILS("查询订单详情", "/smartTravel/taxi/order/queryOrderDetails"),
    TAXI_ORDER_QUERY_DRIVER_LOCATION("获取司机实时位置", "/smartTravel/taxi/order/queryDriverLocation"),
    TAXI_ORDER_MODIFY_ORIGIN_ESTIMATE("修改起点询价（仅限即时单，预约单不支持）", "/smartTravel/taxi/order/modifyOriginEstimate"),
    TAXI_ORDER_MODIFY_ORIGIN_CONFIRM("修改起点确认（仅限即时单，预约单不支持）", "/smartTravel/taxi/order/modifyOriginConfirm"),
    TAXI_ORDER_MODIFY_DEST_ESTIMATE("修改目的地询价（仅限即时订单，预约单暂不支持）", "/smartTravel/taxi/order/modifyDestEstimate"),
    TAXI_ORDER_MODIFY_DEST_CONFIRM("修改目的地确认（仅限即时订单，预约单暂不支持）", "/smartTravel/taxi/order/modifyDestConfirm"),
    TAXI_ORDER_QUERY_ORDER_PLAN_TRACK("司机规划接驾、送驾路线查询（仅限即时订单，预约单暂不支持）", "/smartTravel/taxi/order/queryOrderPlanTrack"),
    TAXI_ORDER_PAY("支付状态通知", "/smartTravel/taxi/order/pay"),
    TAXI_ORDER_QUERY_ORDER_TRACK("订单计费轨迹查询", "/smartTravel/taxi/order/queryOrderTrack"),
    TAXI_ORDER_QUERY_NEARBY_DRIVER("查询附近司机", "/smartTravel/taxi/order/queryNearbyDriver"),
    TAXI_ORDER_QUERY_DECISION_NOTIFY("渠道决策通知", "/smartTravel/taxi/order/decisionNotify"),
    TAXI_COMPLAINT_CREATE("打车投诉创建工单", "/smartTravel/taxi/complaint/create"),
    TAXI_COMPLAINT_UPDATE("打车投诉更新工单", "/smartTravel/taxi/complaint/update"),
    TAXI_COMPLAINT_URGE("打车投诉催促工单", "/smartTravel/taxi/complaint/urge"),
    TAXI_INVOICE_CREATE("打车申请开发票", "/smartTravel/taxi/invoice/create"),
    TAXI_INVOICE_QUERY("打车发票查询", "/smartTravel/taxi/invoice/query"),
    TAXI_INVOICE_RESEND("打车发票重发", "/smartTravel/taxi/invoice/resend"),

    HOMEMAKING_QUERY_AVAILABLE_TIMESLOTS("家政服务查询可预约时间", "/onsite/homemaking/queryAvailableTimeslots"),
    HOMEMAKING_CREATE_ORDER("家政服务创建订单", "/onsite/homemaking/createOrder"),
    HOMEMAKING_QUERY_ORDER("家政服务订单查询", "/onsite/homemaking/queryOrder"),
    HOMEMAKING_CANCEL_ORDER("家政服务取消订单", "/onsite/homemaking/cancelOrder"),
    HOMEMAKING_PAY_ORDER("家政服务订单支付", "/onsite/homemaking/payOrder"),

    ERRANDS_OPEN_CITY_LIST("跑腿服务订单计费查询", "/onsite/runningErrands/openCityList"),
    ERRANDS_ORDER_CALCULATE("跑腿服务订单计费查询", "/onsite/runningErrands/orderCalculate"),
    ERRANDS_CREATE_ORDER("跑腿服务创建订单", "/onsite/runningErrands/createOrder"),
    ERRANDS_QUERY_ORDER("跑腿服务订单查询", "/onsite/runningErrands/queryOrder"),
    ERRANDS_ORDER_MARKUP_PRICE("跑腿服务订单加价", "/onsite/runningErrands/orderMarkupPrice"),
    ERRANDS_QUERY_ORDER_CANCEL_FEE("跑腿服务查询订单取消费用", "/onsite/runningErrands/queryOrderCancelFee"),
    ERRANDS_CANCEL_ORDER("跑腿服务取消订单", "/onsite/runningErrands/cancelOrder"),
    ERRANDS_CONFIRM_GOODS_RETURN("跑腿服务确认物品送回", "/onsite/runningErrands/confirmGoodsReturn"),
    ERRANDS_CALCULATE_ORDER_ADD_WEIGHT_FEE("跑腿服务查询订单续重加价金额", "/onsite/runningErrands/calculateOrderAddWeightFee"),
    ERRANDS_PAY_ADD_WEIGHT_FEE("跑腿服务支付订单续重费用", "/onsite/runningErrands/payAddWeightFee"),

    H5_AUTH_LOGIN("H5免登录", "/open/auth/login"),
    H5_AUTH_REFRESH_ACCESS_TOKEN("刷新AccessToken", "/open/auth/refreshAccessToken"),
    H5_ORDER_QUERY("H5订单查询", "/open/order/queryOrderDetails"),
    ;

    ApiUrl(String apiTitle, String apiUrl) {
        this.apiTitle = apiTitle;
        this.apiUrl = apiUrl;
    }

    /**
     * API名称
     */
    private final String apiTitle;
    /**
     * API地址
     */
    private final String apiUrl;
}
