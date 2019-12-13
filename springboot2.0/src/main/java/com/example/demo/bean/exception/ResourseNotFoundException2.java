package com.example.demo.bean.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *@author zyq
 *@date 2019/12/12 11:40
 *@description ResponseStatusException
 **/

@ResponseStatus(code = HttpStatus.NOT_FOUND) //未实现其真正作用
public class ResourseNotFoundException2 extends RuntimeException {
    public ResourseNotFoundException2() {
    }

    public ResourseNotFoundException2(String message) {
        super(message);
    }
}
