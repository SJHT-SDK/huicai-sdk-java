package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建工单
 *
 * @author ChenBo
 */
@Data
public class TaxiCreateComplaintRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String orderNo;

    private String orderId;

    private String appOrderNo;

    private String appComplaintNo;

    private String faqId;

    private String remark;

    private String passengerMobile;

    private String complaintMobile;

    private String attachments;
}
