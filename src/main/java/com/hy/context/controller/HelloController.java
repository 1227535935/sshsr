package com.hy.context.controller;

import com.hy.context.model.User;
import com.hy.context.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hy on 2018/6/22
 */
@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/helloworld")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUserById(String id){
        User user = userService.getUserById(id);
        return user.toString();
    }

    @RequestMapping("/delUser")
    @ResponseBody
    public String delUserById( ){
        User user = userService.delUserById(1);
        return user.toString();
    }

    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(){
        userService.addUser(null);
        return "ok";
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(String id){
        userService.updateUser(null);
        return "ok";
    }



}
