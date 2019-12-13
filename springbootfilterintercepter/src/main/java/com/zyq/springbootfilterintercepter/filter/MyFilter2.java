package com.zyq.springbootfilterintercepter.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *@author zyq
 *@date 2019/12/13 15:15
 *@description 自定义过滤器
 **/
@Component
public class MyFilter2 implements Filter {

    private static Logger logger = LoggerFactory.getLogger(MyFilter2.class);

    @Override
    public void init(FilterConfig filterConfig) {
        logger.error("初始化过滤器2：", filterConfig.getFilterName());
        logger.info("初始化过滤器2：证明log4j2是配置了CONSOLE_OUT_APPENDER、CONSOLE_ERROR_APPENDER两个控制台日志输出，" +
                "上面那句话才输出了两次");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //对请求进行预处理
        logger.info("过滤器开始对请求进行预处理2：");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String requestUri = httpServletRequest.getRequestURI();
        logger.info("请求的接口为2：" + requestUri);
        long startTime = System.currentTimeMillis();
        //通过 doFilter 方法实现过滤功能
        filterChain.doFilter(servletRequest,servletResponse);
        // 上面的 doFilter 方法执行结束后用户的请求已经返回
        long endTime = System.currentTimeMillis();
        logger.info("该用户的请求已经处理完毕，请求花费的时间2为："+(endTime-startTime));
    }

    @Override
    public void destroy() {
        logger.info("销毁过滤器2");
    }
}
