import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Copyright (C), 2018-2019,
 * FileName: MyWebAppInitializer.java
 * Author： zyq
 * Date： 2019/8/21 19:40
 * Description: Dispatcher注解配置
 * History:
 * <author> <time>            <version>  <desc>
 * zyq      2019/8/21 19:40    1.0       Dispatcher注解配置
 **/
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //Spring容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //SpringMVC容器,DispatcherServlet的URI映射关系配置
    @Override
    protected Class<?>[] getServletConfigClasses() {
        //可以返回Spring的Java配置文件数组
        return new Class<?>[]{WebConfig.class};
    }

    //DispatcherServlet拦截请求匹配
    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.do"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        super.customizeRegistration(registration);
        //配置对multipart的支持
        registration.setMultipartConfig(new MultipartConfigElement("/tmp/coreqi/uploads"));
        //设置load-on-startup优先级
        registration.setLoadOnStartup(1);
    }
}
