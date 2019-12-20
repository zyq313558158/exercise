package com.zyq.springbootmybatis.task;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 *@author zyq
 *@date 2019/12/20 11:41
 *@description SimpleTrigger的使用  jobDataMap 数据共享
 **/

@Slf4j  //相当于 private static Logger logger = LoggerFactory.getLogger(xxx.class);
public class QuartzSimpleTriggerTask extends QuartzJobBean {   //继续实现 implements StatefulJob ，并对相应JobDetail map修改 可共享

    /**
     *@author zyq
     *@date 2019/12/20 11:44
     *@description
     **/
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.error("QuartzSimpleTriggerTask："+(new Date()));
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        Integer second = (Integer) jobDataMap.get("second");
        second+=1;
        log.error("second:"+second);
        jobDataMap.put("second",second);
    }
}
