package com.sjht.sdk.huicai.virtual.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class VirtualGoodsPageRequest implements Serializable {
    private static final long serialVersionUID = -186391029894828232L;

    /**
     * 当前页码。默认为1
     */
    private Integer pageNum = 1;
    /**
     * 页码大小。默认为10，最大值为50
     */
    private Integer pageSize = 10;
}
