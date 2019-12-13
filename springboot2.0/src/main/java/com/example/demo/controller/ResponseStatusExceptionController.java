package com.example.demo.controller;

import com.example.demo.bean.exception.ResourseNotFoundException2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author zyq
 *@date 2019/12/12 11:43
 *@description ResponseStatusExceptionController
 **/

@RestController
@RequestMapping("/api")
public class ResponseStatusExceptionController {
    @GetMapping("/resourseNotFoundException2")
    public void throwException3(){
        throw new ResourseNotFoundException2("Sorry, the resourse not found!");
    }
}
