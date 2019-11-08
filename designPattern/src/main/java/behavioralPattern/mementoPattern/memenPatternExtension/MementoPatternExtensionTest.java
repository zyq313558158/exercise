package behavioralPattern.mementoPattern.memenPatternExtension;

public class MementoPatternExtensionTest {
    public static void main(String[] args) {
        OriginatorPrototype originatorPrototype = new OriginatorPrototype();
        PrototypeCaretaker prototypeCaretaker = new PrototypeCaretaker();
        originatorPrototype.setState("S0");
        System.out.println("初始状态:"+originatorPrototype.getState());
        prototypeCaretaker.setMemento(originatorPrototype.createMemto());   //保存状态
        originatorPrototype.setState("S1");
        System.out.println("新的状态:"+originatorPrototype.getState());
        originatorPrototype.restoreMemento(prototypeCaretaker.getMemento());    //恢复状态
        System.out.println("恢复状态:"+originatorPrototype.getState());
    }
}
