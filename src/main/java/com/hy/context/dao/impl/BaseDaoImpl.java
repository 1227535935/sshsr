package com.hy.context.dao.impl;

import com.hy.context.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by hy on 2018/6/26
 */
@Repository
public class BaseDaoImpl implements BaseDao {

    SessionFactory sessionFactory;

    protected void setUp() throws Exception{
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
    }

    public void test(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.createQuery("select * from t_user");
        session.getTransaction().commit();

    }
}
