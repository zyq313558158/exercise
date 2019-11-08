package behavioralPattern.templateMethodPattern.templateMethodExtension;

//含钩子方法的抽象类
abstract class HookAbstractClass {
    //模板方法
    public void templateMethod(){
        abstractMethod1();
        hookMethod1();
        if (hookMethod2()){
            specificMethod();
        }
        abstractMethod2();
    }
    //抽象方法2
    protected abstract void abstractMethod2();
    //抽象方法1
    protected abstract void abstractMethod1();
    //钩子方法2
    protected  boolean hookMethod2(){
        return true;
    }
    //钩子方法1
    protected abstract void hookMethod1();
    //具体方法
    private void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }


}
