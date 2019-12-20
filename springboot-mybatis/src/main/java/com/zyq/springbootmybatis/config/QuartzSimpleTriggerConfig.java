package com.zyq.springbootmybatis.config;

import com.zyq.springbootmybatis.task.QuartzSimpleTriggerTask;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 *@author zyq
 *@date 2019/12/20 17:01
 *@description simpleTrigger以及usingJobData共享数据
 **/

@Configuration
public class QuartzSimpleTriggerConfig {

    @Bean
    public JobDetail jobDetail(){
        return JobBuilder.newJob(QuartzSimpleTriggerTask.class).withIdentity("QuartzSimpleTriggerTask")
                .storeDurably().usingJobData("second",0).build();
    }

    @Bean
    public Trigger simpleTrigger(){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInMinutes(1).repeatForever();

        return TriggerBuilder.newTrigger().forJob(jobDetail()).withIdentity("QuartzSimpleTriggerTask")
                .withSchedule(simpleScheduleBuilder).build();
    }


}
