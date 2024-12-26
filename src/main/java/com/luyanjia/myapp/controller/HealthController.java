package com.luyanjia.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yanjia.Lu
 * @Date 2024/11/28 18:54
 * @description
 **/
@RestController
public class HealthController {
    @GetMapping("/health")
    public String test() {
        return "health";
    }
}
