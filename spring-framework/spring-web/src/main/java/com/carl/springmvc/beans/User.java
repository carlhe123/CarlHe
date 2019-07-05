package com.carl.springmvc.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description 用户信息POJO
 * @Author carl.he
 * @Date 2019/5/24 10:24
 * @Version 1.0
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 5625754489381937062L;
    private Integer id;
    private String username;
    private String password;
    private Set<Role> roles = new HashSet<>();

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
