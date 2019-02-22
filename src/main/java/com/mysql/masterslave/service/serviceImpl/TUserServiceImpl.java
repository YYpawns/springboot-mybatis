package com.mysql.masterslave.service.serviceImpl;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mysql.masterslave.constant.Result;
import com.mysql.masterslave.mapper.TUserMapper;
import com.mysql.masterslave.model.dto.UserDto;
import com.mysql.masterslave.model.entity.TUser;
import com.mysql.masterslave.service.TUserService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yy
 * @since 2019-02-21
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

    @Override
    @DS("")
    public Result add(UserDto user) {
        TUser tUser = new TUser();
        tUser.setName(user.getName());
        tUser.setCreateTime(new Date());
        baseMapper.insert(tUser);
        return new Result();
    }

    @DS("slave_1")
    @Override
    public Result getList() {
        return new Result(baseMapper.selectList(new EntityWrapper<TUser>().orderBy("id")));
    }
}
