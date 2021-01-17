package com.ssm.demo.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class User{

    public Integer id;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    public String name;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    public String password;

    public String email;

    public Integer status;

    public String createBy;

    public Date createDate;
}


