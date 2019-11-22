package com.zyq.service.imp;

import com.zyq.service.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHelle(String name) {
        return "Hello : " + name;
    }

    @Override
    public String sayBye(String name) {
        return "Bye : " + name;
    }
}
