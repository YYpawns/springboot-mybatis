package com.mysql.masterslave.enums;

/**
 * @Author: yang
 * @Description:
 * @Date: 2019-01-22
 * @Version: 1.0
 */
public enum CodeEnum {

    SUCCESS(200,"SUCCESS"),
    NOT_LOGIN(300,"未登录"),
    ;
    private Integer code ;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private CodeEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
