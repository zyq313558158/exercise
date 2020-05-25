package com.zyq.consulprovicer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.zyq")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulprovicerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulprovicerApplication.class, args);
    }

}
