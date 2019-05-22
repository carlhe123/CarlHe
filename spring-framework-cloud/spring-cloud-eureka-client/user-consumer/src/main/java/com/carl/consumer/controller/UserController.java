package com.carl.consumer.controller;

import com.carl.api.model.User;
import com.carl.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Description TODO Carl写点注释吧！
 * @Author carl.he
 * @Date 2019/5/20 20:36
 * @Version 1.0
 **/
@RestController
public class UserController {

    /** 用户服务 */
    @Autowired
    private UserService userService;

    @PostMapping("/user/list")
    public Collection<User> getAll(){
        return userService.getAll();
    }

    @PostMapping("/user/getById")
    public User getUserById(@RequestParam("id") int id){
        return userService.getUserById(id);
    }

    @PostMapping("/user/save")
    public Boolean save(@RequestBody User user){
        return userService.save(user);
    }


}
