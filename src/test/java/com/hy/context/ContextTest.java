package com.hy.context;

import com.hy.context.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hy on 2018/6/22-11:10.
 */
public class ContextTest {

    @Test
    public void beanTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        User user = (User) ac.getBean("user");
        user.setAge(10);
        System.out.println(user.getAge());
    }
}
