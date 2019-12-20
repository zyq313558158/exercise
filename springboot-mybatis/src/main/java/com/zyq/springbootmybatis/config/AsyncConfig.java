package com.zyq.springbootmybatis.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 *@author zyq
 *@date 2019/12/20 10:26
 *@description spring schedule 定时任务线程池配置
 **/

@Configuration
@EnableAsync
public class AsyncConfig {
    /*
  此处成员变量应该使用@Value从配置中读取
   */
    @Value("${corePoolSize}")
    private int corePoolSize;
    private int maxPoolSize = 200;
    private int queueCapacity = 10;

    private static Logger logger = LoggerFactory.getLogger(AsyncConfig.class);

    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        logger.error(String.valueOf(corePoolSize));
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.initialize();
        return executor;
    }
}
