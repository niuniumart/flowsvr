package com.zdf.asyncflow.service;


import com.zdf.asyncflow.data.AsyncTaskRequest;
import com.zdf.asyncflow.data.AsyncTaskSetRequest;
import com.zdf.asyncflow.data.ReturnStatus;

public interface AsyncTaskService {
    <T> ReturnStatus<T> createTask(AsyncTaskRequest asyncTaskRequest);

    <T> ReturnStatus<T> getTaskList(String taskType, int status, int limit);

    <T> ReturnStatus<T> setTask(AsyncTaskSetRequest asyncTaskSetRequest);

    <T> ReturnStatus<T> getTask(Long task_id);
}
