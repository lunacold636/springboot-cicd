package com.luyanjia.myapp.service;

import com.luyanjia.myapp.req.UserRegisterReq;
import com.luyanjia.myapp.resp.UserRegisterResp;

/**
 * @Author Yanjia.Lu
 * @Date 2024/12/27 1:11
 * @description
 **/
public interface UserRegisterService {

    /**
     * 用户注册方法
     * @param registerReq 用户注册参数
     * @return 注册返回值
     */
    UserRegisterResp userRegister(UserRegisterReq registerReq);
}
