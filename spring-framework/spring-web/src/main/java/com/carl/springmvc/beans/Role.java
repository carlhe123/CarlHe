package com.carl.springmvc.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description 角色信息POJO
 * @Author carl.he
 * @Date 2019/7/5 15:06
 * @Version 1.0
 **/
public class Role implements Serializable {

    private static final long serialVersionUID = 7384862273131847847L;
    private Integer id;
    private String name;
    private Set<Permission> permissions = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
