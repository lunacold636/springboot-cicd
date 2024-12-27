package com.luyanjia.myapp.utils;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * @Author Yanjia.Lu
 * @Date 2024/12/27 15:43
 * @description
 **/
public class SaltUtils {

    public static void main(String[] args) {

    }

    public static String getSalt(){
        SecureRandom random = new SecureRandom();
        // 128位随机盐值
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Arrays.toString(salt);
    }
}
