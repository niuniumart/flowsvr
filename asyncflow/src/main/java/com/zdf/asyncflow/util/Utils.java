package com.zdf.asyncflow.util;


public class Utils {
    /**
     * 获得任务Id
     * @return
     */
    public static Long getTaskId() {
        return SnowFlake.nextId();
    }

    public static boolean isStrNull(String s) {
        return "".equals(s);
    }

    public static boolean isLongNull(Long l) {
        return l == null;
    }






}
