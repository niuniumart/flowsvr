package com.zdf.asyncflow.enums;

import java.util.LinkedList;
import java.util.List;

public enum TaskStatus {
    PENDING(0),
    EXECUTING(1),
    SUCCESS(2),
    FAIL(3);

    private TaskStatus(int status) {
        this.status = status;
    }
    private int status;

    public int getStatus() {
        return this.status;
    }
}
