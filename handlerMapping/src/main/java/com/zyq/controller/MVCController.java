package com.zyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController {
    @RequestMapping("MVCTest")
    public ModelAndView MVCControllerTest(){
        return new ModelAndView("MVCTest");
    }
}
