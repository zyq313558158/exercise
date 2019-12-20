package com.zyq.springbootmybatis.config;

import com.zyq.springbootmybatis.task.QuartzCronTriggerTask;
import com.zyq.springbootmybatis.task.QuartzSimpleTriggerTask;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@author zyq
 *@date 2019/12/20 17:02
 *@description CronTrigger 直接使用cronSchedule表达式很方便
 **/

@Configuration
public class QuartzCronTriggerConfig {
    @Bean
    public JobDetail jobDetailCron(){
        return JobBuilder.newJob(QuartzCronTriggerTask.class).withIdentity("QuartzCronTriggerTask")
                .storeDurably().build();
    }

    @Bean
    public Trigger simpleTriggerCron(){
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0 0/10 16-20 * * ?");

        return TriggerBuilder.newTrigger().forJob(jobDetailCron()).withIdentity("QuartzCronTriggerTask")
                .withSchedule(cronScheduleBuilder).build();
    }
}
