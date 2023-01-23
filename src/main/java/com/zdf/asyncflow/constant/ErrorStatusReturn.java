package com.zdf.asyncflow.constant;

import com.zdf.asyncflow.data.ReturnStatus;
import com.zdf.asyncflow.enums.ErrorStatus;
import com.zdf.asyncflow.enums.TaskStatus;

public class ErrorStatusReturn {
    public static ReturnStatus SUCCESS = new ReturnStatus(ErrorStatus.SUCCESS);
    public static ReturnStatus ERR_INPUT_INVALID = new ReturnStatus(ErrorStatus.ERR_INPUT_INVALID);
    public static ReturnStatus ERR_SHOULD_BIND = new ReturnStatus(ErrorStatus.ERR_SHOULD_BIND);
    public static ReturnStatus ERR_JSON_MARSHAL = new ReturnStatus(ErrorStatus.ERR_JSON_MARSHAL);
    public static ReturnStatus ERR_GET_TASK_INFO = new ReturnStatus(ErrorStatus.ERR_GET_TASK_INFO);
    public static ReturnStatus ERR_GET_TASK_HANDLE_PROCESS = new ReturnStatus(ErrorStatus.ERR_GET_TASK_HANDLE_PROCESS);
    public static ReturnStatus ERR_CREATE_TASK = new ReturnStatus(ErrorStatus.ERR_CREATE_TASK);
    public static ReturnStatus ERR_GET_TASK_LIST_FROM_DB = new ReturnStatus(ErrorStatus.ERR_GET_TASK_LIST_FROM_DB);
    public static ReturnStatus ERR_GET_TASK_SET_POS_FROM_DB = new ReturnStatus(ErrorStatus.ERR_GET_TASK_SET_POS_FROM_DB);
    public static ReturnStatus ERR_INCREASE_CRT_RETRY_NUM = new ReturnStatus(ErrorStatus.ERR_INCREASE_CRT_RETRY_NUM);
    public static ReturnStatus ERR_SET_TASK = new ReturnStatus(ErrorStatus.ERR_SET_TASK);
    public static ReturnStatus ERR_GET_TASK_POS = new ReturnStatus(ErrorStatus.ERR_GET_TASK_POS);
    public static ReturnStatus ERR_GET_PROCESSING_COUNT = new ReturnStatus(ErrorStatus.ERR_GET_PROCESSING_COUNT);
    public static ReturnStatus ERR_SET_USER_PRIORITY = new ReturnStatus(ErrorStatus.ERR_SET_USER_PRIORITY);
    public static ReturnStatus ERR_GET_TASK_CFG_FROM_DB = new ReturnStatus(ErrorStatus.ERR_GET_TASK_CFG_FROM_DB);

    public static boolean IsValidStatus(int status) {
        return  status == TaskStatus.PENDING.getStatus() ||
                status == TaskStatus.EXECUTING.getStatus() ||
                status == TaskStatus.SUCCESS.getStatus() ||
                status == TaskStatus.FAIL.getStatus();
    }
}
