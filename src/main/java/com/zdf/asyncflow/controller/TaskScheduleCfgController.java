package com.zdf.asyncflow.controller;

import com.zdf.asyncflow.data.ReturnStatus;
import com.zdf.asyncflow.service.ScheduleConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task_schedule_cfg")
public class TaskScheduleCfgController {
    @Autowired
    private ScheduleConfigService scheduleConfigService;

    @GetMapping("list")
    public ReturnStatus getTaskTypeCfgList() {
        return scheduleConfigService.getTaskTypeCfgList();
    }
}
