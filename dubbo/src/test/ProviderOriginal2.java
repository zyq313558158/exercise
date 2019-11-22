import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.ruim.ifsp.dubbo.DubboSoaGenericService;
import com.zyq.service.DemoService;
import com.zyq.service.DemolServiceOriginal;
import com.zyq.service.imp.DemoServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProviderOriginal2 {
    public static void main(String[] args) throws IOException {

        DemoService demoService = new DemoServiceImpl();

        List<RegistryConfig> registryConfigs = new ArrayList<>();
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setId("Registry_DubboOriginal");
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        registryConfigs.add(registryConfig);

        List<ProtocolConfig> protocolConfigs = new ArrayList<>();
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setId("Protocol_DubboOriginal");
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20881);
        protocolConfigs.add(protocolConfig);

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("ProviderOriginal1");

        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setApplication(applicationConfig);
        providerConfig.setRegistries(registryConfigs);
        providerConfig.setProtocols(protocolConfigs);
        providerConfig.setTimeout(3000);

        //MethodConfig methodConfig1 = new MethodConfig();
       // methodConfig1.setName("zhang3");
        //MethodConfig methodConfig2 = new MethodConfig();
        //methodConfig2.setName("li4");
        //List<MethodConfig> methodConfigs = new ArrayList<>();
        //methodConfigs.add(methodConfig1);
       // methodConfigs.add(methodConfig2);

        ServiceConfig<GenericService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface("zyq");
        DemolServiceOriginal genericService = new DemolServiceOriginal();
        serviceConfig.setRef(genericService);
        serviceConfig.setProvider(providerConfig);
        //serviceConfig.setMethods(methodConfigs);

        serviceConfig.export();
        System.in.read();

    }
}
