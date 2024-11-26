package com.sjht.sdk.huicai.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 创建代驾订单请求参数
 *
 * @author ChenBo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrivingOrderCommitRequestDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 接入方业务系统内部订单号，只能是数字、大小写字母_-*，且在同一个AppId下唯一
     */
    private String appOrderNo;
    /**
     * 用户手机号码
     */
    private String userMobile;
    /**
     * 代驾服务SKU ID，由世纪恒通为业务接入方开通后提供
     */
    private String serviceSkuId;
    /**
     * 城市码。
     * 下单所在城市城市码，下单派单时筛选指定城市代驾商户需要
     */
    private String cityCode;
    /**
     * 下单起始地址
     */
    private String startAddress;
    /**
     * 下单起始经度
     */
    private String startLongitude;
    /**
     * 下单起始纬度
     */
    private String startLatitude;
    /**
     * 下单目的地地址
     */
    private String endAddress;
    /**
     * 下单目的地经度
     */
    private String endLongitude;
    /**
     * 下单目的地纬度
     */
    private String endLatitude;
    /**
     * 订单变更回调通知地址
     */
    private String notifyUrl;
    /**
     * 接入方业务系统用户ID
     */
    private String userId;
    /**
     * 若不为空表示客户指定代驾服务商进行派单。
     * 注意：若指定的代驾商家编码有误，将会直接返回下单失败；
     */
    private List<String> driveIsvCodeList;

    /**
     * 接入方业务系统用户ID
     */
    private String equityTypeValue;

    /**
     * 接入方业务系统用户ID
     */
    private String equityTypeCode;

    /**
     * 接入方业务系统用户ID
     */
    private String equityId;
    /**
     * 二级分销ID
     */
    private String distributorsId;
    /**
     * 二级分销名称
     */
    private String distributorsName;
}
