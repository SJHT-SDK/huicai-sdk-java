package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 申请开发票请求信息
 *
 * @author ChenBo
 */
@Data
public class TaxiCreateInvoiceRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String orderNo;

    private String title;

    private String buyerType;

    private String receiveEmail;

    private String receiveName;

    private String receiveMobile;

    private String taxNumber;

    private String registerAddress;

    private String registerPhone;

    private String openBank;

    private String bankAccount;

    private String remark;
}
