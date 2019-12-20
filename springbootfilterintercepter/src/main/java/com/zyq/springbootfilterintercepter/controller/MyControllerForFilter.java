package com.zyq.springbootfilterintercepter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class MyControllerForFilter {

    private static Logger logger = LoggerFactory.getLogger(MyControllerForFilter.class);

    @GetMapping("/hello")
    public String getHello(HttpServletRequest httpServletRequest) throws InterruptedException {
        logger.info("RequestURI : "+httpServletRequest.getRequestURI());
        logger.info("RequestURL : "+httpServletRequest.getRequestURL());
        Thread.sleep(1000);
        return "Hello";
    }
}
