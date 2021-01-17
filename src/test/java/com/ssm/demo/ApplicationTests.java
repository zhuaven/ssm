package com.ssm.demo;


import com.ssm.demo.dao.UserMapper;
import com.ssm.demo.entity.User;
import com.ssm.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml"})
public class ApplicationTests {

    private static Logger logger = Logger.getLogger(ApplicationTests.class);

    @Autowired
    public UserService userService;

    @Test
    public void test01(){
        log.info("fanSS info");
        log.debug("fanSS error");
        log.error("fanSS error");
        logger.debug("fanSS debug");
        logger.error("fanSS error");
        System.out.println("w test");

        logger.info("test01,,,,,aaa");

        User user = new User();
        List<User> userRs = userService.getU(user);

        System.out.println(userRs.toString());

//        List<User> userM = userMapper.list("zhu");
//        System.out.println(userM.toString());

    }
}
