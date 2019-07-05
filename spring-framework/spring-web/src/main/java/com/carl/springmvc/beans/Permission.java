package com.carl.springmvc.beans;

import java.io.Serializable;

/**
 * @Description 权限信息POJO
 * @Author carl.he
 * @Date 2019/7/5 16:03
 * @Version 1.0
 **/
public class Permission implements Serializable {
    private static final long serialVersionUID = -4573410595067962426L;
    private String id;
    private String name;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
