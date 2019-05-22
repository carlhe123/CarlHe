package com.carl.provider.repository;

import com.carl.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Description 用户仓储
 * @Author carl.he
 * @Date 2019/5/20 20:21
 * @Version 1.0
 **/
@Repository
public class UserRepository {

    /** 用map保存数据 */
    private final ConcurrentMap<Integer,User> users = new ConcurrentHashMap<>();

    /***
     * @Author carl.he
     * @Description {@link User 用户} 得到全部用户
     * @Date 2019/5/20 20:33
     * @param
     * @return {@link Collection< User>}
     **/
    public Collection<User> getAll() {
        return users.values();
    }

    /***
     * @Author carl.he
     * @Description 保存用户
     * @Date 2019/5/20 20:30
     * @param user {@link User}	用户
     * @return {@link Boolean}
     **/
    public Boolean save(User user) {
        if (user != null) {
            users.put(user.getId(), user);
            return true;
        }
        return false;
    }

    /***
     * @Author carl.he
     * @Description 通过用户id得到对应的用户
     * @Date 2019/5/20 20:31
     * @param id 用户id
     * @return {@link User}
     **/
    public User getUserById(int id) {
        User user = users.get(id);
        if (user != null) {
            return user;
        }
        return null;
    }
}
