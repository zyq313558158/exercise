package com.zyq.service.annotation.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyq.service.annotation.DemoServiceAnnotation;

@Service(timeout = 5000)
public class DemoServiceImpAnnotation implements DemoServiceAnnotation {
    @Override
    public String sayHelloAnnotation(String word) {
        return "hello:"+word;
    }
}
