package com.hy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hy on 2018/6/22
 */
@Controller
public class HelloController {

    @RequestMapping("/helloworld")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }



}
