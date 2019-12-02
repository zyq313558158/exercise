package com.zyq.service.annotation.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zyq.service.annotation.DemoServiceAnnotation;
import org.springframework.stereotype.Component;

/**
 * 注解方式的service
 */
@Component
public class ConsumerAnnotationService {
    @Reference
    private DemoServiceAnnotation demoServiceAnnotation;

    public String doSayHello(String name){
        return demoServiceAnnotation.sayHelloAnnotation(name);
    }
}
