package com.zdf.asyncflow.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TaskList {
    List<AsyncTaskReturn> taskList;
}
