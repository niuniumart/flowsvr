package com.zdf.asyncflow.dao;

import com.zdf.asyncflow.data.TSchedulePos;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TSchedulePosDao {

    /**
     * 新增或修改任务位置
     * @param tSchedulePos
     */
    void save(TSchedulePos tSchedulePos);

    /**
     * 获取任务位置信息
     * @param task_type
     * @return
     */
    TSchedulePos getTaskPos(String task_type);
    List<TSchedulePos> getTaskPosList();
}
