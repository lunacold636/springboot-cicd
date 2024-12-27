package com.luyanjia.myapp.service.impl;

import com.luyanjia.myapp.dao.UserMapper;
import com.luyanjia.myapp.entity.UserEntity;
import com.luyanjia.myapp.req.UserRegisterReq;
import com.luyanjia.myapp.resp.UserRegisterResp;
import com.luyanjia.myapp.service.UserRegisterService;
import com.luyanjia.myapp.utils.SHAUtils;
import com.luyanjia.myapp.utils.SaltUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author Yanjia.Lu
 * @Date 2024/12/27 1:12
 * @description
 **/
@Service
@Slf4j
@AllArgsConstructor
public class UserRegisterServiceImpl implements UserRegisterService {

    private final UserMapper userMapper;

    @Override
    public UserRegisterResp userRegister(UserRegisterReq registerReq) {
        String salt = SaltUtils.getSalt();
        String passwordHash = SHAUtils.sha256(registerReq.getPassword(), salt);
        UserEntity userEntity = new
                UserEntity();
        userEntity.setId(774L);
        userEntity.setUsername(registerReq.getUsername());
        userEntity.setPasswordHash(passwordHash);
        userEntity.setSalt(salt);
        userEntity.setRegistrationMethod(1);
        userEntity.setNickName(registerReq.getNickName());
        userEntity.setCreateTime(new Date());
        userEntity.setDeleteFlag(0);
        userMapper.insert(userEntity);
        return new UserRegisterResp();
    }
}
