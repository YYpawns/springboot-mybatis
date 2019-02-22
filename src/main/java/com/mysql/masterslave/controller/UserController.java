package com.mysql.masterslave.controller;

import com.mysql.masterslave.constant.Result;
import com.mysql.masterslave.model.dto.UserDto;
import com.mysql.masterslave.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yang
 * @Description: 用户测试
 * @Date: 2019-02-22
 * @Version: 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private TUserService userService;

    @PostMapping("add")
    public Result test(@RequestBody UserDto user){
        return userService.add(user);
    }

    @PostMapping("list")
    public Result getList(){
        return userService.getList();
    }
}
