package com.luyanjia.myapp.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @author yanjia.lu
 * @since 2024-12-27 01:03:14
 */
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -8933368762486026405L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名：唯一
     */
    private String username;

    /**
     * 密码哈希值
     */
    private String passwordHash;

    /**
     * 盐值
     */

    private String salt;

    /**
     * 手机号
     */
    private String phoneNum;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 账号昵称
     */
    private String nickName;

    /**
     * 注册方式：1、手机号注册，2、邮箱注册，...
     */
    private Integer registrationMethod;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除 0-否 1-是
     */
    private Integer deleteFlag;


}