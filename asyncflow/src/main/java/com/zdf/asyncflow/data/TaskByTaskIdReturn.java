package com.zdf.asyncflow.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskByTaskIdReturn<E> {
    E taskData;
}
