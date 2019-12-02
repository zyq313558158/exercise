import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class TestLog4j {
    static Logger logger = LoggerFactory.getLogger(TestLog4j.class);
    public static void main(String[] args) {
        logger.debug("debug debug debug debug debug debug debug debug");
        logger.error("error error error error error error error error");
        //为了达到测试效果，没有关闭文件流
        while ((new File("E:/myjava/github/exercise/dubbo/src/debug.log")).length()<=2048){
            logger.debug("debug debug debug debug debug debug debug debug");
        }
    }
}
