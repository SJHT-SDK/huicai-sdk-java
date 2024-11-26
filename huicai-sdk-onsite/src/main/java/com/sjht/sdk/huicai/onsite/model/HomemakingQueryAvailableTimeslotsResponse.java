package com.sjht.sdk.huicai.onsite.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 查询可预约时间
 *
 * @author ChenBo
 */
@Data
public class HomemakingQueryAvailableTimeslotsResponse implements Serializable {

    private static final long serialVersionUID = -1710128650831L;

    /**
     * 服务日期，格式：yyyy-MM-dd
     */
    private String serveDate;
    /**
     * 开始时间 HH:mm
     */
    private String startTime;
    /**
     * 结束时间 HH:mm
     */
    private String endTime;
    /**
     * 服务状态(0-不可约,1-可约)
     */
    private Integer planStatus;
    /**
     * 预约时间段
     */
    private List<HomemakingQueryAvailableTimeslotsResponse> timeSlots;

}
