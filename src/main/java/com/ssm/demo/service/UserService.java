package com.ssm.demo.service;

import com.ssm.demo.dto.user.UserLoginReq;
import com.ssm.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getU(User user);

    User login(UserLoginReq userLoginReq) throws Exception;

    void addUser(User user);
}
