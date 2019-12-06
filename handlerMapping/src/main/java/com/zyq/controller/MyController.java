package com.zyq.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyController {
    public ModelAndView myDispatcher(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse ){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("MyController【myDispatcher】：调用成功");
        modelAndView.setViewName("test");
        modelAndView.addObject("test");
        modelAndView.addObject("aaa","bbb");
        System.out.println(modelAndView.toString());
        return modelAndView;
    }
}
