package com.mysql.masterslave.service;

import com.baomidou.mybatisplus.service.IService;
import com.mysql.masterslave.constant.Result;
import com.mysql.masterslave.model.dto.UserDto;
import com.mysql.masterslave.model.entity.TUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yy
 * @since 2019-02-21
 */
public interface TUserService extends IService<TUser> {

    Result add(UserDto user);

    Result getList();
}
