package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
