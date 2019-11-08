package behavioralPattern.commandPattern.commandPatternExtension;

//树叶构件: 具体命令1
public class ConcreteCommand1 implements AbstractCommand {

    private CompositeReceiver compositeReceiver;

    public ConcreteCommand1() {
        compositeReceiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        compositeReceiver.action1();
    }
}
