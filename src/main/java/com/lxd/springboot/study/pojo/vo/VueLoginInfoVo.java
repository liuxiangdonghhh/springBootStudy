package com.lxd.springboot.study.pojo.vo;

import javax.validation.constraints.NotNull;

/**
 * @description Vue登录页面demo信息对象实体
 * @author liuxiangdong
 * @date 2019-5-14 16:53
 */
public class VueLoginInfoVo {

    @NotNull(message="用户名不允许为空")
    private String username;

    @NotNull(message="密码不允许为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}