package com.luyanjia.myapp.req;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Author Yanjia.Lu
 * @Date 2024/12/27 1:39
 * @description
 **/
@Data
public class UserRegisterReq implements Serializable {


    private static final long serialVersionUID = -6186730522082366922L;

    /**
     * 用户名：唯一
     */
    @NotBlank(message = "用户名不能为空")
    @Length(min = 1,max = 20,message = "用户名在1到20个字符串之间")
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    @Length(min = 1,max = 20,message = "用户名在1到20个字符串之间")
    private String password;

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
}
