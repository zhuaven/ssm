package com.ssm.demo.controller;

import com.ssm.demo.common.ResultData;
import com.ssm.demo.dto.user.UserLoginReq;
import com.ssm.demo.entity.User;
import com.ssm.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping(value = "/user")
@Api(value = "user的操作类", description = "User类")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String index(@RequestBody User user){
        return "user index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    @ApiOperation(value = "user home返回ModelAndView", notes = "user页面")
    @ResponseBody
    public ModelAndView home(@RequestBody Map<String, String> param){
        ModelAndView mav = new ModelAndView();
        mav.addObject("param", param);
        mav.setViewName("/home/index");
        return mav;
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "user info返回ModelAndView", notes = "user页面", response = ModelAndView.class)
    public ModelAndView info(@RequestBody UserLoginReq req){
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //进行对对象 赋值  键值对的形式
        modelAndView.addObject("deptList", "sss");
        modelAndView.setViewName("showDept");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录", notes = "登录接口v1")
    @ResponseBody
    public ResultData login(@RequestBody UserLoginReq req)
    {
        ResultData rd = new ResultData();
        try {
            userService.login(req);
        }catch (Exception e){
            rd.setCode("604");
            rd.setMsg(e.getMessage());
            return rd;
        }
        return rd;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiOperation(value = "user test返回ModelAndView", notes = "test页面")
    public ModelAndView test()
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("param", "test");
        mv.setViewName("/index");
        return mv;
    }
}
