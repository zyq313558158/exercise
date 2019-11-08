package behavioralPattern.mementoPattern.memenPatternExtension;

//原型管理者
public class PrototypeCaretaker {
    private OriginatorPrototype originatorPrototype;

    public void setMemento(OriginatorPrototype originatorPrototype){
        this.originatorPrototype = originatorPrototype;
    }

    public OriginatorPrototype getMemento(){
        return originatorPrototype;
    }
}
