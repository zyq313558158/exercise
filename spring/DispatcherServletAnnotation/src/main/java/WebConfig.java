import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2018-2019,
 * FileName: WebConfig.java
 * Author： zyq
 * Date： 2019/8/21 20:00
 * Description:
 * History:
 * <author> <time>            <version>  <desc>
 * zyq      2019/8/21 20:00    1.0       配置DispatcherServletS上下文
 **/

@Configuration
//定义Spring MVC 扫描的包
@ComponentScan(value = "com.*",
            includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
            value = Controller.class)})
//启动Spring MVC 配置
@EnableWebMvc
public class WebConfig {

    /**
     * @Description 通过注解@Bean初始化视图解析器
     *
     * @Param  传入参数类型
     *          : []
     *
     * @return org.springframework.web.servlet.ViewResolver 视图解析器
     * @throws
     */
    @Bean(name = "internalResourceViewResolver")
    public ViewResolver initViewResolver(){
        InternalResourceViewResolver viewResolver
                = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/JSP");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    /**
     * @Description 初始化RequestMappingHandlerAdapter,并加载HTTP的json转换器
     *
     * @Param  传入参数类型
     *          : []
     *
     * @return org.springframework.web.servlet.HandlerAdapter 对象
     * @throws
     */
    @Bean(name = "requestMappingHandlerAdapter")
    public HandlerAdapter initRequestMappingHandlerAdapter(){
        //创建RequestMappingHandlerAdapter,并加载Http的JSON转换器
        RequestMappingHandlerAdapter rmhd = new RequestMappingHandlerAdapter();
        //HTTP JSON 转换器
        MappingJackson2HttpMessageConverter jsonConverter
                = new MappingJackson2HttpMessageConverter();
        //MappingJackson2HttpMessageConverter接收JSON类型信息的转换
        MediaType mediaType = MediaType.APPLICATION_JSON_UTF8;
        List<MediaType> mediaTypes = new ArrayList<MediaType>();
        mediaTypes.add(mediaType);
        // 加入转换器的支持类型
        jsonConverter.setSupportedMediaTypes(mediaTypes);
        // 给适配器加入JSON转换器
        rmhd.getMessageConverters().add(jsonConverter);
        return rmhd;
    }
}
