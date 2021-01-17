package com.ssm.demo.Util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;

public class MD5Util {
    //盐，用于混交md5
    @Value("${MD5Slat}")
    private static String slat;

    /**
     * 生成md5
     * @param str
     * @return
     */
    public static String getMD5(String str) {
        String base = str + "/" + slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }
}
