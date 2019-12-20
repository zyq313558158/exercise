package com.zyq.springbootmybatis.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 *@author zyq
 *@date 2019/12/19 17:24
 *@description  使用schedule线程池 测试
 **/
@Async          //使用schedule线程池
@Component     //1.主要用于标记配置类，兼备Component的效果。
//@EnableScheduling    // 2.开启定时任务   //直接在springboot启动类上注解也可以
public class SpringScheduledTask {
    private static Logger logger = LoggerFactory.getLogger(SpringScheduledTask.class);

    //3.添加定时任务
    @Scheduled(cron = "* * * * * ? ")
    public void nowTime() throws InterruptedException {
        logger.info("nowTime()"+(new Date()).toString());
        Thread.sleep(10*1000);
    }

    //3.添加定时任务
    @Scheduled(cron = "* * * * * ? ")
    public void nowTime2() throws InterruptedException {
        logger.info("nowTime2()"+(new Date()).toString());
        Thread.sleep(10*1000);
    }
}
