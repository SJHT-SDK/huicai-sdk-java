package com.sjht.sdk.huicai.core.service;

import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API基础服务
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseApiService {

    protected HuicaiApiClient baseClient;

}
