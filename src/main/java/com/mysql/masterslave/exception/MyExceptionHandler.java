package com.mysql.masterslave.exception;

import com.mysql.masterslave.constant.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yang
 * @Description: 全局异常处理
 * @Date: 2019-01-22
 * @Version: 1.0
 */
@ControllerAdvice
@ResponseBody
public class MyExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    public Result handlerMyException(MyException ex){
        Result result = new Result();
        result.setCode(400);
        result.setMsg(ex.getMessage());
        return result;
    }

    @ExceptionHandler(value = LoginException.class)
    public Result handlerLoginException(LoginException exception){
        Result result = new Result();
        result.setCode(300);
        result.setMsg(exception.getMessage());
        return result;
    }
}
