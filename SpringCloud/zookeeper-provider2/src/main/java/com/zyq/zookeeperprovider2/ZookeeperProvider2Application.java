package com.zyq.zookeeperprovider2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ZookeeperProvider2Application {

	@Value("${server.port}")
	String port;

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperProvider2Application.class, args);
	}

	@RequestMapping(value = "/hi")
	public String sayHello(String name){
		return "你好："+name+"，我来自端口:"+port;
	}
}
