package com.ssm.demo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ssm.demo.dto.user.UserLoginReq;
import com.ssm.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> list(@Param("name") String name);

    User login(UserLoginReq userLoginReq);
}
