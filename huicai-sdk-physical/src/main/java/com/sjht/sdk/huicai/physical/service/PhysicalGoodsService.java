package com.sjht.sdk.huicai.physical.service;

import com.alibaba.fastjson2.JSONObject;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.physical.model.PhysicalGoodsDetailsResponse;
import com.sjht.sdk.huicai.physical.model.PhysicalGoodsPageRequest;
import com.sjht.sdk.huicai.physical.model.PhysicalGoodsPageResponse;
import com.sjht.sdk.huicai.physical.model.PhysicalGoodsSkuStockPriceResponse;

import java.util.List;

/**
 * 实物商品服务
 *
 * @author ChenBo
 */
public class PhysicalGoodsService extends BaseApiService {

    public PhysicalGoodsService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 查询实物商品列表
     *
     * @param request 请求参数
     * @return 响应参数
     */
    public Result<List<PhysicalGoodsPageResponse>> pageList(PhysicalGoodsPageRequest request) {
        return this.baseClient.executeToList(ApiUrl.PHYSICAL_GOODS_PAGE_LIST, request, PhysicalGoodsPageResponse.class);
    }

    /**
     * 查询实物商品详情
     *
     * @param goodsId 商品ID
     * @return 实物商品详情
     */
    public Result<PhysicalGoodsDetailsResponse> details(String goodsId) {
        if (goodsId == null || goodsId.isEmpty()) {
            throw new RuntimeException("商品ID不能为空");
        }
        JSONObject request = new JSONObject();
        request.put("goodsId", goodsId);
        return this.baseClient.execute(ApiUrl.PHYSICAL_GOODS_DETAILS, request, PhysicalGoodsDetailsResponse.class);
    }

    /**
     * 查询实物商品SKU库存及价格
     *
     * @param skuId SKU ID
     * @return 实物商品SKU库存以及价格
     */
    public Result<PhysicalGoodsSkuStockPriceResponse> skuStockPrice(String skuId) {
        if (skuId == null || skuId.isEmpty()) {
            throw new RuntimeException("skuId不能为空");
        }
        JSONObject request = new JSONObject();
        request.put("skuId", skuId);
        return this.baseClient.execute(ApiUrl.PHYSICAL_GOODS_SKU_STOCK_PRICE, request, PhysicalGoodsSkuStockPriceResponse.class);
    }
}
