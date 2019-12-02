package provider;
import com.zyq.configuration.DubboProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class ProviderAnnotation {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboProviderConfiguration.class);
        context.start();
        System.in.read();
    }
}
