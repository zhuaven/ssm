package com.ssm.demo.service.impl;

import com.ssm.demo.Util.MD5Util;
import com.ssm.demo.dao.UserMapper;
import com.ssm.demo.dto.user.UserLoginReq;
import com.ssm.demo.entity.User;
import com.ssm.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> getU(User user) {
        logger.info("user info  info!!");
        logger.debug("user debug!!");
        logger.error("user error!!");
        List<User> userList = new ArrayList<User>();
        User a = new User();
        a.setName("dd");
        userList.add(a);
        User b = new User();
        b.setName("bb");
        userList.add(b);
        return userList;
    }

    public User login(@Valid UserLoginReq userLoginReq) throws Exception {
        userLoginReq.setPassword(MD5Util.getMD5(userLoginReq.getPassword()));
        User user = userMapper.login(userLoginReq);
        if(user == null){
            throw new Exception("用户或密码错误");
        }
        return user;
    }

    public void addUser(@Valid User user){
        user.setStatus(1);
        user.setCreateDate(new Date());
        userMapper.insert(user);
    }
}
