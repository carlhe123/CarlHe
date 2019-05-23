package com.carl.consumer.proxy;

import com.carl.api.model.User;
import com.carl.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Description TODO Carl写点注释吧！
 * @Author carl.he
 * @Date 2019/5/21 9:46
 * @Version 1.0
 **/
@Service
public class UserServiceProxy implements UserService {

    private static final String PROVIDER_SERVER_URL_PREFIX = "http://provider-client";

    /**
     * 通过 REST API 代理到服务器提供者
     */
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Collection<User> getAll() {
        Collection<User> returnValue =
                restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX + "/user/list",null,Collection.class);
        return returnValue;

    }

    @Override
    public Boolean save(User user) {
        User returnValue =
                restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX + "/user/save", user, User.class);
        return returnValue != null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
