package behavioralPattern.statePattern.statePattern;

public class StatePatternTest {
    public static void main(String[] args) {
        //创建环境
        Context context = new Context();
        //处理请求
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
