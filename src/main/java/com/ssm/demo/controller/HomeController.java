package com.ssm.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/home")
@Api(value = "home的操作类", description = "home类")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView index(){
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //进行对对象 赋值  键值对的形式
        Map<String, String> param = new HashMap<String, String>();
        param.put("ab","aa");
        modelAndView.addObject("param", param);
        modelAndView.addObject("user", param);
        modelAndView.setViewName("/home/index");
        return modelAndView;
    }

    @RequestMapping(value = "/demo", method = RequestMethod.POST)
    @ResponseBody
    public String demo(){
        return "home demo cd dd1111";
    }
}
