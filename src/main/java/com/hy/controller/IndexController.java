package com.hy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hy on 2018/6/22
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "/index_page";
    }
}
