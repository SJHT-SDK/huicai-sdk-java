package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 发票信息查询返回信息
 *
 * @author ChenBo
 */
@Data
public class TaxiQueryInvoiceResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String invoiceId;

    private String receiveName;

    private String receiveMobile;

    private String receiveEmail;

    private String applicationTime;

    private String invoiceUrl;

    private String title;

    private String taxNumber;

    private String content;

    private Integer amount;

    private Integer status;

    private String invoiceNo;

    private Integer invoiceType;

    private String invoiceNumber;

    private String checkCode;

    private Integer invoiceTax;
}
