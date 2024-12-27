package com.luyanjia.myapp.utils;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author Yanjia.Lu
 * @Date 2024/12/27 1:56
 * @description
 **/
@Slf4j
public class SHAUtils {

    public static String sha256(String originalString, String salt) {

        originalString = originalString + salt;
        try {
            // 获取 SHA-256 的 MessageDigest 实例
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // 计算哈希值
            byte[] hashBytes = digest.digest(originalString.getBytes());
            // 将哈希值转换为十六进制字符串
            StringBuilder hexString = new StringBuilder();
            String hex = "";
            for (byte b : hashBytes) {
                hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hex;
        } catch (NoSuchAlgorithmException e) {
            log.info("hash加密出现错误:"+originalString);
            return "";
        }
    }
}
