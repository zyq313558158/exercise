package com.zyq.gateway.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
  * @Description: 自定义GatewayFilter
  * @Param:
  * @return:
  * @Author: zyq
  * @Date: 2020/4/24 15:20
  */
public class RequestTimeFilter implements GatewayFilter, Ordered {

    private static final Log log = LogFactory.getLog(GatewayFilter.class);
    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(REQUEST_TIME_BEGIN, System.currentTimeMillis());
        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> {
                    Long startTime = (Long) exchange.getAttributes().get(REQUEST_TIME_BEGIN);
                    if (null != startTime){
                        log.info("RequestTimeFilter;"+exchange.getRequest().getURI().getRawPath() + ":" + (System.currentTimeMillis() - startTime + "ms"));
                    }
                })
        );
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
