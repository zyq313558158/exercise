package com.zyq.springbootmybatis.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


/**
 *@author zyq
 *@date 2019/12/20 10:28
 *@description 不使用schedule线程池测试
 **/

@Configuration      //1.主要用于标记配置类，兼备Component的效果。
//@EnableScheduling //直接在springboot启动类上注解也可以
public class SpringScheduledTask2 {
    private static Logger logger = LoggerFactory.getLogger(SpringScheduledTask.class);

    //3.添加定时任务
    @Scheduled(cron = "* * * * * ? ")
    private void nowTime3() throws InterruptedException {
        logger.info("nowTime3()"+(new Date()).toString());
        Thread.sleep(10*1000);
    }
}
