package com.zyq.consulprovicer.controller;

import com.zyq.consulprovicer.service.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String  feignTest(@RequestParam("param") String param){
        return param;
    }

    @Autowired(required = true)
    Feign feign;



    @RequestMapping("/test/feign")
    public String getFeign(@RequestParam ("param") String param){
        return "get : " + feign.feignTest(param) + ",success" ;
    }

}
