package com.example.demo.bean.exception;


import lombok.Getter;
import lombok.Setter;

//自定义异常类型
/**
 *@author zyq
 *@date 2019/12/11 15:14
 *@description 自定义异常类型
 **/
public class ResourceNotFoundException extends RuntimeException{
    @Getter
    @Setter
    private String message;

    public ResourceNotFoundException(){
        super();
    }

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }


}
