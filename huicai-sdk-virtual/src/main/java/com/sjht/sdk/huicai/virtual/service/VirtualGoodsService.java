package com.sjht.sdk.huicai.virtual.service;

import com.alibaba.fastjson.JSONObject;
import com.sjht.sdk.huicai.core.client.DefaultApiClient;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.config.HuicaiApiConfig;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.virtual.model.*;

import java.util.List;

/**
 * 虚拟数字权益商品服务
 *
 * @author ChenBo
 */
public class VirtualGoodsService extends BaseApiService {

    public VirtualGoodsService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 查询虚拟数字权益商品列表
     *
     * @param request 查询分页参数
     * @return 虚拟数字权益商品列表
     */
    public Result<List<VirtualGoodsPageResponse>> pageList(VirtualGoodsPageRequest request) {
        return this.baseClient.executeToList(ApiUrl.VIRTUAL_GOODS_PAGE_LIST, request, VirtualGoodsPageResponse.class);
    }

    /**
     * 查询虚拟数字权益商品详情
     *
     * @param goodsId 商品ID
     * @return 虚拟数字权益商品列表
     */
    public Result<VirtualGoodsDetailsResponse> details(String goodsId) {
        if (goodsId == null || goodsId.isEmpty()) {
            throw new RuntimeException("商品ID不能为空");
        }
        JSONObject request = new JSONObject();
        request.put("goodsId", goodsId);
        return this.baseClient.execute(ApiUrl.VIRTUAL_GOODS_DETAILS, request, VirtualGoodsDetailsResponse.class);
    }

    /**
     * 虚拟商品SKU库存以及价格
     *
     * @param skuId SKU ID
     * @return 虚拟商品SKU库存以及价格
     */
    public Result<VirtualGoodsSkuStockPriceResponse> skuStockPrice(String skuId) {
        if (skuId == null || skuId.isEmpty()) {
            throw new RuntimeException("skuId不能为空");
        }
        JSONObject request = new JSONObject();
        request.put("skuId", skuId);
        return this.baseClient.execute(ApiUrl.VIRTUAL_GOODS_SKU_STOCK_PRICE, request, VirtualGoodsSkuStockPriceResponse.class);
    }

    /**
     * 根据SKU ID分页查询适用门店
     *
     * @param request 请求参数
     * @return 适用门店
     */
    public Result<List<VirtualCouponShopResponse>> getCouponShopList(VirtualCouponShopRequest request) {
        if (request == null || request.getSkuId() == null || request.getSkuId().isEmpty()) {
            throw new RuntimeException("skuId不能为空");
        }
        return this.baseClient.executeToList(ApiUrl.VIRTUAL_GOODS_COUPON_SHOP_LIST, request, VirtualCouponShopResponse.class);
    }

    public static void main(String[] area) {

    }
}
