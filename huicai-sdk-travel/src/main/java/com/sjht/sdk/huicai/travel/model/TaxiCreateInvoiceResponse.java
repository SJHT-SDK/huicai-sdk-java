package com.sjht.sdk.huicai.travel.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 申请开发票返回信息
 *
 * @author louWang
 * @since 2024/6/4 17:19
 */
@Data
public class TaxiCreateInvoiceResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<InvoiceResponseDto> invoices;

    @Data
    public static class InvoiceResponseDto implements Serializable {
        private static final long serialVersionUID = 1L;
        /**
         * 发票id
         */
        private String invoiceId;
        /**
         * 发票总金额，单位：分
         */
        private Integer amount;
        /**
         * 有效发票的订单编号列表
         */
        private List<String> invoiceOrders;
        /**
         * 无效订单编号列表
         */
        private List<String> invalidOrders;
    }
}
