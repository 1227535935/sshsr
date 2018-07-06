package com.hy.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by hy on 2018/6/22-11:12.
 */
@Entity
@Table(name = "t_user")
public class User {

    private String id;

    private int age = 20;

    private String name = "hy";

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
