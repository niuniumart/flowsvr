package com.zdf.asyncflow.service;

import com.zdf.asyncflow.data.ReturnStatus;

public interface ScheduleConfigService {
    <T> ReturnStatus<T> getTaskTypeCfgList();
}
