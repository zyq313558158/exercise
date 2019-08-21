package com.zyq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C), 2018-2019,
 * FileName: TestController.java
 * Author： zyq
 * Date： 2019/8/21 22:49
 * Description: Controller测试
 * History:
 * <author> <time>            <version>  <desc>
 * zyq      2019/8/21 22:49    1.0       Controller测试
 **/
@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,String> test(){
        Map<String,String> map = new HashMap<>();
        map.put("key","value");
        return map;
    }
}
