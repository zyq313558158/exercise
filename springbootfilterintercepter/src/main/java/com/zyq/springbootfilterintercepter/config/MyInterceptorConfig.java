package com.zyq.springbootfilterintercepter.config;

import com.zyq.springbootfilterintercepter.Interceptor.AdminInterceptor;
import com.zyq.springbootfilterintercepter.Interceptor.LogInterceptor;
import com.zyq.springbootfilterintercepter.Interceptor.OldLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    AdminInterceptor adminInterceptor;
    @Autowired
    LogInterceptor logInterceptor;
    @Autowired
    OldLoginInterceptor oldLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // LogInterceptor apply to all URLs.
        registry.addInterceptor(logInterceptor);

        // Old Login url, no longer use.
        // Use OldURLInterceptor to redirect to a new URL.
        registry.addInterceptor(oldLoginInterceptor).addPathPatterns("/admin/oldLogin");

        // This interceptor apply to URL like /admin/*
        // Exclude /admin/oldLogin
        registry.addInterceptor(new AdminInterceptor())//
                .addPathPatterns("/admin/*")//
                .excludePathPatterns("/admin/oldLogin");
    }
}
