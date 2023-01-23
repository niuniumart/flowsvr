package com.zdf.asyncflow.dao;

import com.zdf.asyncflow.data.TSchedulePos;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TSchedulePosDao {
    void save(TSchedulePos tSchedulePos);
    TSchedulePos getTaskPos(String task_type);
    List<TSchedulePos> getTaskPosList();
}
