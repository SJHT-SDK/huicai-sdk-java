package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 开通城市查询
 *
 * @author ChenBo
 */
@Data
public class ErrandsOpenCityResponse implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 城市ID
     */
    private String id;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 区县名称
     */
    private String countyName;
}
