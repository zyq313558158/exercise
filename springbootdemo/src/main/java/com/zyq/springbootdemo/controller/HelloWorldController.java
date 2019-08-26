package com.zyq.springbootdemo.controller;

import com.zyq.springbootdemo.dao.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/user")
    public String getUser(){
        return new User("张三",27).getName();
    }
}
