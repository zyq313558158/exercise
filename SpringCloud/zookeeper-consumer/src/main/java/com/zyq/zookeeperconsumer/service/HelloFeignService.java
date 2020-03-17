package com.zyq.zookeeperconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zookeeper-provider")
public interface HelloFeignService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHelleo(@RequestParam("name") String name);
}
