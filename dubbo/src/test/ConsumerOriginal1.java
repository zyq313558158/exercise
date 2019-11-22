import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.zyq.service.DemoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsumerOriginal1 {
    public static void main(String[] args) throws IOException {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setId("Registry_ConsumerOriginal");
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        List<RegistryConfig> registryConfigs = new ArrayList<>();
        registryConfigs.add(registryConfig);

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("ConsumerOriginal1");


        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setApplication(applicationConfig);
        consumerConfig.setRegistries(registryConfigs);
        consumerConfig.setCheck(false);

        ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setInterface(DemoService.class);
        referenceConfig.setConsumer(consumerConfig);
        //referenceConfig.setGeneric(true);

        DemoService demoService = referenceConfig.get();
        System.out.println(demoService.sayHelle("haha"));

        System.in.read();
    }
}
