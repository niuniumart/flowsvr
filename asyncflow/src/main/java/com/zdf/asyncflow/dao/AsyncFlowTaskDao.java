package com.zdf.asyncflow.dao;

import com.zdf.asyncflow.data.AsyncFlowTask;
import com.zdf.asyncflow.enums.TaskStatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AsyncFlowTaskDao {
    void create(AsyncFlowTask asyncFlowTask);
    void save(AsyncFlowTask asyncFlowTask);
    List<AsyncFlowTask> getTaskList(String taskType, int status, int limit);
    List<AsyncFlowTask> getAliveTaskList(List<Integer> statusList);
    int getTaskCountByStatus(int status);
    int getTaskCount(List<Integer> statusList);
    List<AsyncFlowTask> getLongTimeProcessing(int status, int limit, long maxProcessTime, long currentTime, String type);
    void increaseCrtRetryNum(Long taskId);
    void updateTask(AsyncFlowTask asyncFlowTask, List<Integer> statuss);
    AsyncFlowTask find(Long task_id);
    void setStatus(Long task_id);
    void updateTask_contextByTask_id(Long task_id);
    void modifyTimeoutPending(Long currentTime, Long maxProcessingTime, int status);
}
