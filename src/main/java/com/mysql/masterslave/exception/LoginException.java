package com.mysql.masterslave.exception;

/**
 * @Author: yang
 * @Description:
 * @Date: 2019-01-22
 * @Version: 1.0
 */
public class LoginException extends RuntimeException{
    public LoginException (String msg){
        super(msg);
    }
}
