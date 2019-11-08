package behavioralPattern.templateMethodPattern.templateMethodExtension;

public class HookConcreteMethod extends HookAbstractClass {
    @Override
    protected void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    protected void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    protected boolean hookMethod2() {
        return false;
    }

    @Override
    protected void hookMethod1() {
        System.out.println("钩子方法1被重写...");
    }


}
