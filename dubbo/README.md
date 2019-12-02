# exercise
平时学习练习之用


1.这篇文档详细讲解了dubbo的使用，基本涵盖dubbo的所有功能特性。：
 https://dubbo.gitbooks.io/dubbo-user-book/
 
 2.dubbo源码解析-集群容错架构设计：
 https://www.jianshu.com/p/8e007012367e
 
 3.mvn将jar包导出本地仓库：修改最后的***即可，值得是被导出jar包的位置
 
  mvn install:install-file -DgroupId=com.alipay -DartifactId=trade-sdk -Dversion=1.0.0 -Dpackaging=jar -Dfile=***
  
 4. Dubbo 一篇文章就够了：从入门到实战(很好易懂)
 https://segmentfault.com/a/1190000019896723
 
 
 5.ssm-dubbo github fork：https://github.com/zyq313558158/ssm-dubbo
 
 6.log4j2配置文件log4j2.xml详解（转载）：https://www.cnblogs.com/new-life/p/9246143.html
 
 
 
 
 
 
简单总结:
	1.dubbo服务端主要涉及:
	(1)ApplicationConfig相关配置；
	(2)RegistryConfig注册中心相关配置;
	(3)ProtocolConfig传输协议相关配置;
	(4)ProviderConfig相关配置	
	
	// 服务提供者暴露服务配置
	// 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
	// 按照xml、注解等的dubbo规则配置不用关心它，已被封装，除非泛化引用等使用时。
	ServiceConfig<XxxService> service = new ServiceConfig<XxxService>(); 
	
	2.dubbo客户端主要涉及:
	(1)ApplicationConfig相关配置；
	(2)RegistryConfig注册中心相关配置;
	(3)ConsumerConfig相关配置
	
	// 引用远程服务
	// 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
	// 按照xml、注解等的dubbo规则配置不用关心它，已被封装，除非泛化引用等使用时。
	ReferenceConfig<XxxService> reference = new ReferenceConfig<XxxService>(); 
	
	3.dubbo使用方式
	(1)xml配置;
	(2)注解配置;
	(3)直连(不经过注册中心);
	(4)泛化(主要用于架构封装使用)。