package com.zdf.asyncflow.service;

import com.zdf.asyncflow.data.ReturnStatus;
import com.zdf.asyncflow.data.ScheduleConfig;

public interface ScheduleConfigService {
    /**
     * 获取任务列表
     * @param <T>
     * @return
     */
    <T> ReturnStatus<T> getTaskTypeCfgList();

    /**
     * 新增任务配置项
     * @param scheduleConfig
     * @param <T>
     * @return
     */
    <T> ReturnStatus<T> save(ScheduleConfig scheduleConfig);
}
