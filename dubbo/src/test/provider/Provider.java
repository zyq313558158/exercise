package provider;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        classPathXmlApplicationContext.start();
        System.in.read(); // 按任意键退出
    }
}
