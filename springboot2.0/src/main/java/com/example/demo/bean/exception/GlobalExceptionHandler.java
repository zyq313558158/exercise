package com.example.demo.bean.exception;

import com.example.demo.controller.ExceptionController;
import com.example.demo.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@author zyq
 *@date 2019/12/11 16:31
 *@description 全局异常处理类
 **/

@ControllerAdvice//(assignableTypes = {ExceptionController.class}) //通过 assignableTypes 指定特定的 Controller 类，让异常处理类只处理特定类抛出的异常
@ResponseBody
public class GlobalExceptionHandler {
    ErrorResponse illegalArgumentResponse = new ErrorResponse(new IllegalArgumentException("参数错误!"));
    ErrorResponse resourceNotFoundResponse = new ErrorResponse(new ResourceNotFoundException("Sorry, the resourse not found!"));
    @ExceptionHandler(value = Exception.class)// 拦截所有异常, 这里只是为了演示，一般情况下一个方法特定处理一种异常
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception e){

        if (e instanceof IllegalArgumentException){
            return ResponseEntity.status(400).body(illegalArgumentResponse);
        }else if (e instanceof ResourceNotFoundException){
            return ResponseEntity.status(400).body(resourceNotFoundResponse);
        }else if(e instanceof ResourseNotFoundException2){
            ErrorResponse resourseNotFoundResponse2 = new ErrorResponse(e);
            return ResponseEntity.status(400).body(resourseNotFoundResponse2);
        }
        return ResponseEntity.status(400).body(new ErrorResponse("aaa","bb"));
    }
}
