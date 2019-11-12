package com.carl.springmvc.service;

import com.carl.springmvc.beans.User;
import com.carl.springmvc.model.TAuthUser;

/**
 * @Description 用户服务
 * @Author carl.he
 * @Date 2019/7/8 12:03
 * @Version 1.0
 **/
public interface UserService {
    TAuthUser findUserByName(String userName);
}
