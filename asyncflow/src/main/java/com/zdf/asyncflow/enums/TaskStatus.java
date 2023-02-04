package com.zdf.asyncflow.enums;


/**
 * 任务状态
 */
public enum TaskStatus {
    PENDING(1),
    EXECUTING(2),
    SUCCESS(3),
    FAIL(4);

    private TaskStatus(int status) {
        this.status = status;
    }
    private int status;

    public int getStatus() {
        return this.status;
    }
}
