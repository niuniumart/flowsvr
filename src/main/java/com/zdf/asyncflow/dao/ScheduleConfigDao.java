package com.zdf.asyncflow.dao;

import com.zdf.asyncflow.data.ScheduleConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScheduleConfigDao {
    ScheduleConfig getTaskTypeCfg(String task_type);
    void save(ScheduleConfig scheduleConfig);
    List<ScheduleConfig> getTaskTypeCfgList();

}
