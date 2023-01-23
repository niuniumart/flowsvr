package com.zdf.asyncflow.service.impl;

import com.zdf.asyncflow.constant.ErrorStatusReturn;
import com.zdf.asyncflow.dao.ScheduleConfigDao;
import com.zdf.asyncflow.data.ConfigReturn;
import com.zdf.asyncflow.data.ReturnStatus;
import com.zdf.asyncflow.data.ScheduleConfig;
import com.zdf.asyncflow.enums.ErrorStatus;
import com.zdf.asyncflow.service.ScheduleConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleConfigServiceImpl implements ScheduleConfigService {
    @Autowired
    private ScheduleConfigDao scheduleConfigDao;

    Logger logger = LoggerFactory.getLogger(ScheduleConfigServiceImpl.class);

    @Override
    public <T> ReturnStatus<T> getTaskTypeCfgList() {
        List<ScheduleConfig> taskTypeCfgList;
        try {
            taskTypeCfgList = scheduleConfigDao.getTaskTypeCfgList();
        } catch (Exception e) {
            logger.error(ErrorStatus.ERR_GET_TASK_CFG_FROM_DB.getMsg());
            return ErrorStatusReturn.ERR_GET_TASK_CFG_FROM_DB;
        }
        ConfigReturn configReturn = new ConfigReturn(taskTypeCfgList);
        return new ReturnStatus(configReturn);
    }
}
