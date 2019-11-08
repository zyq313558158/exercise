package behavioralPattern.commandPattern.commandPatternExtension;

public class commandPatternExtensionTest {
    public static void main(String[] args) {
        CompositeInvoker compositeInvoker = new CompositeInvoker();
        AbstractCommand abstractCommand1 = new ConcreteCommand1();
        AbstractCommand abstractCommand2 = new ConcreteCommand2();
        compositeInvoker.add(abstractCommand1);
        compositeInvoker.add(abstractCommand2);
        System.out.println("客户访问调用者的execute()方法...");
        compositeInvoker.execute();
    }
}
