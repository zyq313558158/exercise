package com.zyq.zookeeperconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.zyq.zookeeperconsumer.service.HelloFeignService;

@RestController
public class HelloContrller {
    @Autowired
    HelloFeignService helloFeignService;

    @GetMapping(value = "/hi")
    public String sayHello(@RequestParam("name") String name){
        return helloFeignService.sayHelleo(name);
    }
}
