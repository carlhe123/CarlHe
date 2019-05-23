package com.carl.provider.service;

import com.carl.api.model.User;
import com.carl.api.service.UserService;
import com.carl.provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @Description {@link UserService 用户服务} 服务实现类
 * @Author carl.he
 * @Date 2019/5/20 20:20
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    /** {@link UserRepository 用户仓储} */
    @Autowired
    private UserRepository repository;

    @Override
    public Collection<User> getAll() {
        return repository.getAll();
    }

    @Override
    public Boolean save(User user) {
        return repository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return repository.getUserById(id);
    }
}
