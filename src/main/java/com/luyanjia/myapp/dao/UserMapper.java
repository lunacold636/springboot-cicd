package com.luyanjia.myapp.dao;

import com.luyanjia.myapp.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Yanjia.Lu
 * @Date 2024/12/27 1:09
 * @description
 **/
@Mapper
public interface UserMapper {

    int insert(UserEntity user);

    int update(UserEntity user);

    int delete(Long id);
}
