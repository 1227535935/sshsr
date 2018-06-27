package com.hy.context.service.impl;

import com.hy.context.dao.UserDao;
import com.hy.context.model.User;
import com.hy.context.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hy on 2018/6/25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    public User delUserById(Integer id) {
        return userDao.delUserById(id);
    }

    public void addUser(User user) {
        userDao.addUser(new User(20,"zhangsan"));
    }

    public void updateUser(User user) {
        userDao.updateUser(new User(2,21,"zhangsan"));
    }
}
