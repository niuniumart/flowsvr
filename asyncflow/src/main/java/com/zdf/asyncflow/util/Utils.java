package com.zdf.asyncflow.util;


public class Utils {
    /**
     * 获得任务Id
     * @return
     */
    public static Long getTaskId() {
        return SnowFlake.nextId();
    }






}
