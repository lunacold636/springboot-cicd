package com.luyanjia.myapp;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Yanjia.Lu
 * @Date 2024/11/28 13:42
 * @description
 **/
@Slf4j
@SpringBootApplication
@MapperScan("com.luyanjia.myapp.dao")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
        log.info("ReachSplitServiceApplication 启动成功");
    }
}
