package com.hy.context.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by hy on 2018/6/22-11:12.
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private int age;

    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(Integer id,int age, String name) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
