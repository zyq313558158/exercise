package behavioralPattern.statePattern.statePattern;

//具体状态A类
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是:A......");
        context.setState(new ConcreteStateB());
    }
}
