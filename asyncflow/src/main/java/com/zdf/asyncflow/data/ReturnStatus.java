package com.zdf.asyncflow.data;

import com.zdf.asyncflow.enums.ErrorStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReturnStatus<E> {
    private String msg;
    private int code;
    private E result;

    public ReturnStatus() {

    }
    public ReturnStatus(ErrorStatus errorStatus) {
        this.code = errorStatus.getErrCode();
        this.msg = errorStatus.getMsg();
    }


    public ReturnStatus(E result) {
        this(ErrorStatus.SUCCESS);
        this.result = result;
    }

}
