package com.carl.consumer.controller;

import com.carl.api.model.User;
import com.carl.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Description 用户操作
 * @Author carl.he
 * @Date 2019/5/20 20:36
 * @Version 1.0
 **/
@RestController
public class UserController {

    /** 用户服务 */
    @Autowired
    private UserService userService;

    @GetMapping("/user/list")
    public Collection<User> getAll(){
        System.out.println("查询全部用户");
        return userService.getAll();
    }

    @PostMapping("/user/getById")
    public User getUserById(@RequestParam("id") int id){
        return userService.getUserById(id);
    }

    @PostMapping("/user/save")
    public Boolean save(@RequestBody User user){
        System.out.println(user);
        return userService.save(user);
    }


}
