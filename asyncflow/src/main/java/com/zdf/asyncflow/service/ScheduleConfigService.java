package com.zdf.asyncflow.service;

import com.zdf.asyncflow.data.ReturnStatus;

public interface ScheduleConfigService {
    /**
     * 获取任务列表
     * @param <T>
     * @return
     */
    <T> ReturnStatus<T> getTaskTypeCfgList();
}
