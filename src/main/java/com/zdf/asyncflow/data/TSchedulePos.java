package com.zdf.asyncflow.data;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_schedule_pos
 */
@Data
public class TSchedulePos implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String taskType;

    /**
     * 数据从第几号表开始
     */
    private Integer dataBeginPos;

    /**
     * 数据从第几号表结束
     */
    private Integer dataEndPos;

    /**
     * 调度开始于几号表
     */
    private Integer scheduleBeginPos;

    /**
     * 调度结束于几号表
     */
    private Integer scheduleEndPos;

    /**
     * 
     */
    private Long createTime;

    /**
     * 
     */
    private Long modifyTime;



}