package com.zyq.zookeeperconsumer.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//如果想自定义则要继承AbstractLoadBalancerRule进行相关规则定义
//特别的:这些都是ribbon的功能,只是feign整合了ribbo而已
@Configuration
public class MySelfRule{
    @Bean
    public IRule myRule(){
        return new RandomRule();// Ribbon默认是轮询，我自定义为随机

    }
}
