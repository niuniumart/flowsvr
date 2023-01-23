package com.zdf.asyncflow.data;

import lombok.Data;

@Data
public class AsyncFlowClientData {

    private String user_id;

    private String task_type;
    
    private String task_stage;

    private String schedule_log;

    private String task_context;

}
