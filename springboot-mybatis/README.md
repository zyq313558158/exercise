# exercise
平时学习练习之用

Spring Boot 2.+的默认连接池HikariCP详解：https://www.jianshu.com/p/7e4c0e9ad49a


tomcat和weblogic下使用druid 驱动jndi：https://blog.csdn.net/qq_15541045/article/details/52315956

关于druid连接池显示sql监控等，servlet为页面(必须配置)，filter为对请求监控(可不配置)，连接属性filters为sql监控(建议配置,值为stat即可);
1.常规SSM
	(1)web.xml 配置相关servlet和filter;
	(2)数据源信息中配置(xml)属性filters。
2.springboot(导入druid-spring-boot-starter包)
	(1)DruidConfiguration.class(自定义)中配置相关servlet和filter;
	(2)applicaton.properties中属性配置filters.
3.tomcat jndi数据源
	(1)DruidConfiguration.class(自定义)中配置相关servlet和filter;
	(2)context.xml中属性配置filters;
	(2))context.xml中属性配置 factory=com.alibaba.druid.pool.DruidDataSourceFactory
	(3)tomcat根目录/lib 下加入druid jar。

	
SpringBoot定时任务：https://www.jianshu.com/p/9e278b1059b6
spring boot 几种定时任务的实现方式：https://www.jianshu.com/p/b6809b5a0c26
玩转SpringBoot之定时任务详解：https://www.cnblogs.com/mmzs/p/10161936.html
Quartz快速入门指南（.w3cschool.）：https://www.w3cschool.cn/quartz_doc/quartz_doc-67a52d1f.html
	
	
关于定时任务：
1.jdk自带的(使用很少);
2.schedule spring的(默认单线程的，可以使用ThreadPoolTaskExecutor完成多线程):
		注：若定时任务周期执行，周期内任务没有执行完成，则下次执行将轮空，执行下下次。
3.quartz job jobdetail(可参数共享) trigger(普通和 cron)
		注：据说优势在于分布式的使用，待对比。
	