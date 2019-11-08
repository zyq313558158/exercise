package behavioralPattern.commandPattern.commandPatternExtension;

//树叶构件: 具体命令2
public class ConcreteCommand2 implements AbstractCommand {

    private CompositeReceiver compositeReceiver;

    ConcreteCommand2(){
        compositeReceiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        compositeReceiver.action2();
    }
}
