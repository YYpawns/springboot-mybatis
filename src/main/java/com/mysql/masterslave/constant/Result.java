package com.mysql.masterslave.constant;

import com.mysql.masterslave.enums.CodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: yang
 * @Description:
 * @Date: 2019-01-22
 * @Version: 1.0
 */
@Data
public class Result<T> implements Serializable {
    private Integer code = 200;
    private String msg = "SUCCESS";
    private T data;

    public Result(){
        super();
    }

    public Result(T data){
        super();
        this.data = data;
    }

    public Result(T data, String msg){
        super();
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg){
        super();
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data){
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(CodeEnum codeEnum){
        super();
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }

    public Result(CodeEnum codeEnum, T data){
        super();
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
        this.data = data;
    }
}
