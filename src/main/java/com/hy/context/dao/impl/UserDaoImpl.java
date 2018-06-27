package com.hy.context.dao.impl;

import com.hy.context.dao.UserDao;
import com.hy.context.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hy on 2018/6/25
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;


/*    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }*/

    public User getUserById(String id) {
        Session session = sessionFactory.getCurrentSession();
        List list = session.createQuery("from User where id='" + id+"'").list();
        User user = (User) list.get(0);
        return user;
    }

    public User delUserById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(new User(1,0,null));
        return null;
    }

    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    public void updateUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }
}
