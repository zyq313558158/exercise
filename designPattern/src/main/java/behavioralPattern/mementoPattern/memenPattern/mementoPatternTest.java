package behavioralPattern.mementoPattern.memenPattern;

public class mementoPatternTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("S0");
        System.out.println("初始状态:"+originator.getState());
        careTaker.setMemento(originator.createMemento()); //保存状态
        originator.setState("S1");
        System.out.println("新的状态:"+originator.getState());
        originator.restoreMemento(careTaker.getMemento());  //恢复状态
        System.out.println("恢复状态:"+originator.getState());
    }
}
