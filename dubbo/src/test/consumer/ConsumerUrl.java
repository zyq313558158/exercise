package consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.zyq.service.DemoService;

import java.io.IOException;

public class ConsumerUrl {
    public static void main(String[] args) throws IOException {

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumer.ConsumerOriginal1");

        ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setUrl("dubbo://10.15.34.35:20881/com.zyq.service.DemoService");
        referenceConfig.setInterface(DemoService.class);
        referenceConfig.setApplication(applicationConfig);
        DemoService demoService = referenceConfig.get();

        System.out.println(demoService.sayHelle("lala"));
        System.in.read();
    }
}
