package com.luyanjia.myapp.controller;

import com.luyanjia.myapp.req.UserRegisterReq;
import com.luyanjia.myapp.resp.UserRegisterResp;
import com.luyanjia.myapp.service.UserRegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yanjia.Lu
 * @Date 2024/12/27 1:36
 * @description
 **/
@RestController
@AllArgsConstructor
public class UserRegisterController {

    private final UserRegisterService registerService;

    @PostMapping("/register")
    public UserRegisterResp register(@RequestBody UserRegisterReq registerReq){
        return registerService.userRegister(registerReq);
    }

}
