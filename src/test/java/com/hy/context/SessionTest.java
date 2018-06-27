package com.hy.context;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by hy on 2018/6/26
 */
public class SessionTest {

    @Resource
    private SessionFactory sessionFactory;

    @Test
    public void test(){
//        这种获取sessionFactory需要配置hibernate.cfg.xml文件
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.getTransaction();
    }
}
