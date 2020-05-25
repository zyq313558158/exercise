package com.zyq.servicefeign.controller;

import com.zyq.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright (C), 2018-2019,
 * FileName: HiController.java
 * Author： zyq
 * Date： 2020/3/15 19:22
 * Description:
 * History:
 * <author> <time>            <version>  <desc>
 * zyq      2020/3/15 19:22    1.0
 **/
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @PostMapping("/user/{name}")
    public String addUser(@PathVariable String name){
        System.out.println("增加用户: /user/"+name);
        return schedualServiceHi.addUser(name);
    }
}
