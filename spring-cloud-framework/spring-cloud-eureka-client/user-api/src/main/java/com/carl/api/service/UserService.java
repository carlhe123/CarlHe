package com.carl.api.service;

import java.util.Collection;
import com.carl.api.model.User;

public interface UserService {

    /***
     * @Author carl.he
     * @Description {@link User 用户} 得到全部用户
     * @Date 2019/5/20 20:29
     * @param
     * @return {@link Collection< User> 用户集合}
     **/
    public Collection<User> getAll();

    /***
     * @Author carl.he
     * @Description 保存用户
     * @Date 2019/5/20 20:30
     * @param user {@link User}	用户
     * @return {@link Boolean}
     **/
    public Boolean save(User user);

    /***
     * @Author carl.he
     * @Description 通过用户id得到对应的用户
     * @Date 2019/5/20 20:31
     * @param id 用户id
     * @return {@link User}
     **/
    public User getUserById(int id);
}
