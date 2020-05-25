package com.zyq.gateway;

import com.zyq.gateway.filter.RequestTimeFilter;
import com.zyq.gateway.filter.TokenFilter;
import com.zyq.gateway.filter.factory.RequestTimeGatewayFilterFactory;
import com.zyq.gateway.keyResolver.HostAddrKeyResolver;
import com.zyq.gateway.keyResolver.UriKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/hi")
//                        .filters(f -> f.addRequestParameter("name", "li4"))
//                        .uri("http://localhost:8765"))
//                .build();
//    }

    /**
      * @Description: 将自定义GatewayFilter配置在路由中
      * @Param:
      * @return:
      * @Author: zyq
      * @Date: 2020/4/24 15:21
      */
//    @Bean
//    public RouteLocator helloRouteLocator(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route(r -> r.path("/hi/**")
//                .filters(f -> f.filter(new RequestTimeFilter())
//                        .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
//                        .uri("http://localhost:8765")
//                        .order(0)
//                        .id("hello_filter_router")
//
//                ).build();
//    }

    /**
      * @Description: 注册bean RequestTimeGatewayFilterFactory
      * @Param:
      * @return:
      * @Author: zyq
      * @Date: 2020/4/24 18:18
      */
    @Bean
    public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }
    
    /**
      * @Description: 注册bean TokenFilter(自定义GlobalFilter )
      * @Param:   
      * @return:   
      * @Author: zyq
      * @Date: 2020/4/24 18:20 
      */ 
//    @Bean
//    public TokenFilter tokenFilter(){
//        return new TokenFilter();
//    }

    /**
      * @Description:   根据hostAddr限流(未成功)
     * @Param:
      * @return:
      * @Author: zyq
      * @Date: 2020/4/25 17:49
      */
//    @Bean
//    public HostAddrKeyResolver hostAddrKeyResolver(){
//        return new HostAddrKeyResolver();
//    }

    /**
      * @Description: 根据uri限流(未成功)
      * @Param:   
      * @return:   
      * @Author: zyq
      * @Date: 2020/4/25 17:49 
      */ 
//    @Bean
//    public UriKeyResolver uriKeyResolver() {
//        return new UriKeyResolver();
//    }
}
