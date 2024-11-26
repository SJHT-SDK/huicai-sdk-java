package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建工单
 *
 * @author ChenBo
 */
@Data
public class TaxiUpdateComplaintRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String orderNo;

    private String orderId;

    private String complaintNo;

    private String appComplaintNo;

    private String faqId;

    private String remark;

    private String attachments;

    private Integer complaintType;

    private String supplierOrderNo;
}
