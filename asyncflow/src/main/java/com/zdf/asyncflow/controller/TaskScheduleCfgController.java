package com.zdf.asyncflow.controller;

import com.zdf.asyncflow.constant.ErrorStatusReturn;
import com.zdf.asyncflow.data.ReturnStatus;
import com.zdf.asyncflow.data.ScheduleConfig;
import com.zdf.asyncflow.service.ScheduleConfigService;
import com.zdf.asyncflow.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task_schedule_cfg")
public class TaskScheduleCfgController {
    Logger logger = LoggerFactory.getLogger(TaskScheduleCfgController.class);


    @Autowired
    private ScheduleConfigService scheduleConfigService;

    @GetMapping("list")
    public ReturnStatus getTaskTypeCfgList() {
        return scheduleConfigService.getTaskTypeCfgList();
    }

    @GetMapping("task_configuration")
    public ReturnStatus SetTaskCFG(@RequestBody ScheduleConfig scheduleConfig) {
        if (Utils.isStrNull(scheduleConfig.getTask_type())) {
            logger.error("input invalid");
            return ErrorStatusReturn.ERR_INPUT_INVALID;
        }
        return scheduleConfigService.save(scheduleConfig);
    }
}
