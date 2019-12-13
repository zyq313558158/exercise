package com.example.demo.controller;

import com.example.demo.bean.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;

/**
 *@author zyq
 *@date 2019/12/11 16:00
 *@description ExceptionController模拟抛出异常
 **/

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/illegalArgumentException")
    public void throwException(){
        throw new IllegalArgumentException();
    }

    @GetMapping("/resourceNotFoundException")
    public void throwException2(){
        throw new ResourceNotFoundException();
    }

    @GetMapping("/other1")
    public void throwException3(){
        throw new ClassCastException();
    }

    @GetMapping("/other2")
    public void throwException4() throws TimeoutException {
        throw new TimeoutException();
    }
}
