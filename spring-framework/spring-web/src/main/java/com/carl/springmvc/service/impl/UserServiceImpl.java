package com.carl.springmvc.service.impl;

import com.carl.springmvc.beans.User;
import com.carl.springmvc.mapper.TAuthUserMapper;
import com.carl.springmvc.model.TAuthUser;
import com.carl.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 用户服务实现类
 * @Author carl.he
 * @Date 2019/7/8 12:05
 * @Version 1.0
 **/

@Component
public class UserServiceImpl implements UserService {

    @Resource
    private TAuthUserMapper userMapper;

    @Override
    public User findUserByName(String userName) {
        List<TAuthUser> userList =  userMapper.selectByName(userName);
        User user = new User();
        if (CollectionUtils.isEmpty(userList)){
            return null;
        }
        return user;
    }
}
