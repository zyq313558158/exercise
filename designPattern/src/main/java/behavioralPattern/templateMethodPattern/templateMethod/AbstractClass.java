package behavioralPattern.templateMethodPattern.templateMethod;

//抽象类
abstract class AbstractClass {
    //模板方法
    public void TemplateMethod(){
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    //抽象方法1
    abstract void abstractMethod1();
    //抽象方法2
    abstract void abstractMethod2();
    //具体方法
    private void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
}
