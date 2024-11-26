package com.sjht.sdk.huicai.travel.service;

import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.enums.ApiUrl;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.core.service.BaseApiService;
import com.sjht.sdk.huicai.travel.model.*;

/**
 * 酒店服务
 *
 * @author ChenBo
 */
public class HotelService extends BaseApiService {

    public HotelService(HuicaiApiClient baseClient) {
        super(baseClient);
    }

    /**
     * 查询酒店列表
     *
     * @param request 查询参数
     * @return 酒店列表
     */
    public Result<HotelListResponse> getHotelList(HotelListRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_LIST, request, HotelListResponse.class);
    }

    /**
     * 查询酒店详情
     *
     * @param request 查询参数
     * @return 酒店详情
     */
    public Result<HotelDetailsResponse> getHotelDetails(HotelDetailsRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_DETAILS, request, HotelDetailsResponse.class);
    }

    /**
     * 查询酒店房量房价
     *
     * @param request 查询参数
     * @return 酒店房量房价
     */
    public Result<HotelRoomPriceResponse> getHotelRoomPrice(HotelRoomPriceRequest request) {
        return this.baseClient.execute(ApiUrl.HOTEL_DETAILS, request, HotelRoomPriceResponse.class);
    }
}
