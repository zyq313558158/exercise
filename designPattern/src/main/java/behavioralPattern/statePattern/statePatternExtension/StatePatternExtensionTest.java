package behavioralPattern.statePattern.statePatternExtension;

public class StatePatternExtensionTest {
    public static void main(String[] args) {
        //创建环境
        ShareContext shareContext = new ShareContext();
        //处理请求
        shareContext.handle();
        shareContext.handle();
        shareContext.handle();
        shareContext.handle();
        shareContext.handle();
    }
}
