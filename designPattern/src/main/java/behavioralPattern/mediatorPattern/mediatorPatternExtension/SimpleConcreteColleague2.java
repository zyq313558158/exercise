package behavioralPattern.mediatorPattern.mediatorPatternExtension;

//具体同事类
public class SimpleConcreteColleague2 implements  SimpleColleague {

    public SimpleConcreteColleague2() {
        SimpleMediator simpleMediator = SimpleMediator.getSimpleMediator();
        simpleMediator.register(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类2：收到请求。");
    }

    @Override
    public void send() {
        SimpleMediator simpleMediator = SimpleMediator.getSimpleMediator();
        System.out.println("具体同事类2：发出请求...");
        simpleMediator.relay(this); //请中介者转发
    }
}
