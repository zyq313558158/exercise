package consumer;

import com.zyq.configuration.DubboConsumerConfiguration;
import com.zyq.service.annotation.consumer.ConsumerAnnotationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class ConsumerAnnotation {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(DubboConsumerConfiguration.class);
        annotationConfigApplicationContext.start();// 启动
        ConsumerAnnotationService consumerAnnotationService =
                annotationConfigApplicationContext.getBean(ConsumerAnnotationService.class);
        System.out.println(consumerAnnotationService.doSayHello("dubbo"));
        System.in.read();
    }

}
