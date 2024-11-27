package com.sjht.sdk.huicai.test;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.sjht.sdk.huicai.core.client.DefaultApiClient;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.config.HuicaiApiConfig;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.h5.model.H5QueryOrderRequest;
import com.sjht.sdk.huicai.h5.model.H5QueryOrderResponse;
import com.sjht.sdk.huicai.h5.service.H5OrderService;
import com.sjht.sdk.huicai.virtual.model.VirtualGoodsDetailsResponse;
import com.sjht.sdk.huicai.virtual.service.VirtualGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class HuicaiSdkTestApplicationTests {

    /**
     * 初始化客户端
     *
     * @return HuicaiApiClient
     */
    private HuicaiApiClient initClient() {
        HuicaiApiConfig config = HuicaiApiConfig.builder()
                .serverUrl("https://testdj.cyzl.com/")
                .appId("0hbpbotn1qi8bu3d")
                .appSecret("904e9d4b814847869e9ebd566288d360")
                .encryptSecretKey("L3h6cxOAny7a9XVS3rE0lHDL")
                .logWitch(true)
                .build();
        return new DefaultApiClient(config);
    }

    @Test
    void testVirtual() {
        HuicaiApiClient client = this.initClient();

        //Result<List<VirtualGoodsPageResponse>> result = new VirtualGoodsService(client).pageList(new VirtualGoodsPageRequest());

        Result<VirtualGoodsDetailsResponse> detailsResponseResult = new VirtualGoodsService(client).details("1858681727363321858");

//        Result<VirtualGoodsSkuStockPriceResponse> priceResponseResult = new VirtualGoodsService(client).skuStockPrice("1858681727552065538");

//        VirtualCouponShopRequest request = new VirtualCouponShopRequest();
//        request.setSkuId("1833759654941339650");
//        Result<List<VirtualCouponShopResponse>> couponShopResult = new VirtualGoodsService(client).getCouponShopList(request);


//        Result<VirtualOrderDetailsResponse> orderDetailsResponseResult=new VirtualOrderService(client).getDetails("1859790198814117889","132518634589712952");

    }

    @Test
    void testH5Api() {
//        H5AuthLoginRequest request = new H5AuthLoginRequest();
//        request.setPhone("13809475135");
//        request.setWxOpenId("");
//        Result<H5AuthLoginResponse> h5LoginResult = new H5AuthService(this.initClient()).login(request);
//        log.info("免登录API返回数据-->{}", JSON.toJSONString(h5LoginResult));

        H5QueryOrderRequest orderRequest = new H5QueryOrderRequest();
        orderRequest.setModule("VIRTUAL");
        orderRequest.setOrderNo("1859789476387196929");
        Result<H5QueryOrderResponse> h5OrderResult = new H5OrderService(this.initClient()).queryOrderDetails(orderRequest);
        log.info("H5订单查询返回数据-->{}", JSON.toJSONString(h5OrderResult));
    }

    @Test
    void testExecuteCustomApi() {
        JSONObject params = new JSONObject();
        params.put("module", "VIRTUAL");
        params.put("orderNo", "1859789476387196929");
        Result<JSONObject> result = this.initClient().execute("/open/order/queryOrderDetails", params, JSONObject.class);
        log.info("自定义接口URL请求返回数据-->{}", JSON.toJSONString(result));
    }

}
