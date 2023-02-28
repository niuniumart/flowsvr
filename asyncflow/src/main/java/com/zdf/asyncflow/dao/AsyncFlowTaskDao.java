package com.zdf.asyncflow.dao;

import com.zdf.asyncflow.data.AsyncFlowTask;
import com.zdf.asyncflow.enums.TaskStatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AsyncFlowTaskDao {
    /**
     * 创建任务
     * @param asyncFlowTask
     */
    void create(AsyncFlowTask asyncFlowTask);

    /**
     * 新增或更新任务
     * @param asyncFlowTask
     */
    void save(AsyncFlowTask asyncFlowTask);

    /**
     * 获得对应状态的对应任务列表
     * @param taskType 任务类型
     * @param status 任务状态
     * @param limit 限制数目
     * @return
     */
    List<AsyncFlowTask> getTaskList(String taskType, int status, int limit);

    /**
     * 更新任务信息
     * @param asyncFlowTask
     * @param statuss
     */
    void updateTask(AsyncFlowTask asyncFlowTask, List<Integer> statuss);

    /**
     * 获得活跃状态的任务
     * @param statusList 活跃状态列表
     * @return
     */
    List<AsyncFlowTask> getAliveTaskList(List<Integer> statusList);

    /**
     * 获取对应状态的任务数
     * @param status 任务状态
     * @return
     */
    int getTaskCountByStatus(int status);

    /**
     * 获取任务状态列表中的任务数
     * @param statusList
     * @return
     */
    int getTaskCount(List<Integer> statusList);

    /**
     * 获取处于执行状态的超过最大执行时间的任务列表
     * @param status 任务状态
     * @param limit 限制数目
     * @param maxProcessTime 任务最大执行时间
     * @param currentTime 当前时间
     * @return
     */
    List<AsyncFlowTask> getLongTimeProcessing(int status, int limit, long maxProcessTime, long currentTime);

    /**
     *  增加重试次数
     * @param taskId
     */
    void increaseCrtRetryNum(Long taskId);

    /**
     *  根据任务查找任务
     * @param task_id
     * @return
     */
    AsyncFlowTask find(Long task_id);

    /**
     * 设置任务状态
     * @param task_id
     */
    void setStatus(Long task_id);

    /**
     * 更改任务上下文
     * @param task_id
     */
    void updateTask_contextByTask_id(Long task_id);

    /**
     * 更改超时的任务为Pending状态
     * @param currentTime
     * @param maxProcessingTime
     * @param oldStatus
     * @param newStatus
     */
    void modifyTimeoutPending(Long currentTime, Long maxProcessingTime, int oldStatus, int newStatus);

    /**
     * 查看指定用户的任务
     * @param user_id
     * @param statusList
     * @return
     */
    List<AsyncFlowTask> getTaskByUser_idAndStatus(String user_id, List<Integer> statusList);
}
