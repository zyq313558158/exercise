package com.zyq.handlerMapping;

import com.zyq.controller.MyController;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component



public class MyhandlerMapping extends AbstractHandlerMapping{

    @Resource
    private MyController myController;

    @Override
    protected Object getHandlerInternal(HttpServletRequest httpServletRequest) throws Exception {
        System.out.println("getHandlerInternal : 调用成功");
        String url = this.getUrlPathHelper().getRequestUri(httpServletRequest);
        System.out.println(url);

        //浏览器在第一次加载项目域名页面完成时,会自动加载/favicon.ico
        if ("/favicon.ico".equals(url)){
            return null;
        }
        return new HandlerMethod(myController,myController.getClass().getMethod("myDispatcher",
                new Class[]{HttpServletRequest.class, HttpServletResponse.class}));
    }
}
