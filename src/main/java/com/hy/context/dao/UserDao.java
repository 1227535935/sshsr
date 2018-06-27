package com.hy.context.dao;

import com.hy.context.model.User;

/**
 * Created by hy on 2018/6/25
 */
public interface UserDao {

    User getUserById(String id);
    User delUserById(Integer id);
    void addUser(User user);
    void updateUser(User user);
}
