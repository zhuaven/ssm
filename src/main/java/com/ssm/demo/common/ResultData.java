package com.ssm.demo.common;

import lombok.Data;

@Data
public class ResultData {
    public String code;

    public String msg;

    public Object data;

    public ResultData(){
        code = "200";
        msg = "成功";
    }
}
