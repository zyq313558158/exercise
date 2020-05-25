# exercise

Spring Cloud 系列文章：https://www.fangzhipeng.com/spring-cloud.html

SpringCloud Gateway的简单学习：
1.gateway路由分为两种配置方式:
	(1)在配置文件application.xml中进行配置;
	(2)通过public RouteLocator xxxRoutes(RouteLocatorBuilder builder) {}注册为bean进行配置。

2.GatewayFilter(需要通过spring.cloud.routes.filters 配置在具体路由下，只作用在当前路由上或通过spring.cloud.default-filters配置在全局，作用在所有路由上)
	(1)自定义GatewayFilter，完成之后只能通过bean进行路由配置使用;特别的chain.filter(exchange).then()是“post”处理(即响应之后);
	(2)自定义GatewayFilterFactory,完成之后需要将工程注册为bean之后便可以在配置文件application.xml中进行配置使用；
	问题：同时配置以上两种,(1)的方式起作用？

3.GlobalFilter(全局过滤器，不需要在配置文件中配置，作用在所有的路由上)
		
	
4.SpringCloud Gateway之限流
	未能实现,就先不说了,链接 https://www.fangzhipeng.com/springcloud/2018/12/22/sc-f-gatway4.html
	
5.spring cloud gateway之服务注册与发现
	https://www.fangzhipeng.com/springcloud/2018/12/23/sc-f-gateway5.html
	两种方式。
	(1)直接在url中加入service-hi可实现，localhost:8081/service-hi/hi?name=1323，还需如下配置
		spring:
		  cloud:
			gateway:
			  discovery:
				locator:
				  enabled: true
				  lowerCaseServiceId: true
	(2)配置文件中加入路径过滤断言路由：lb://SERVICE-FEIGN