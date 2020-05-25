package com.zyq.consulprovicer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("consul-provider")
public interface Feign {
    @RequestMapping("/test")
    String feignTest(@RequestParam("param") String param);
}
