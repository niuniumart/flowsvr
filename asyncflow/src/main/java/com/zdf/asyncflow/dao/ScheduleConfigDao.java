package com.zdf.asyncflow.dao;

import com.zdf.asyncflow.data.ScheduleConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScheduleConfigDao {
    /**
     * 根据任务类型获取任务配置
     * @param task_type
     * @return
     */
    ScheduleConfig getTaskTypeCfg(String task_type);

    /**
     * 新增
     * @param scheduleConfig
     */
    void save(ScheduleConfig scheduleConfig);

    /**
     * 获取所有任务配置列表
     * @return
     */
    List<ScheduleConfig> getTaskTypeCfgList();

}
