package com.zyq.springbootmybatis.task;


import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 *@author zyq
 *@date 2019/12/20 17:09
 *@description 简单测试cronTrigger
 **/

@Slf4j
public class QuartzCronTriggerTask extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.error("我是QuartzCronTriggerTask    ：    "+(new Date()));
    }
}
