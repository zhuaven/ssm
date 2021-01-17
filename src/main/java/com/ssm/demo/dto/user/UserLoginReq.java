package com.ssm.demo.dto.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserLoginReq {
    /**
     * 用户名
     */
    @NotBlank
    public String name;

    /**
     * 密码
     */
    @NotBlank
    public String password;
}
