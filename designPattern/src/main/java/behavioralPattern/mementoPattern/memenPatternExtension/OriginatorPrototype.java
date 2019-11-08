package behavioralPattern.mementoPattern.memenPatternExtension;

//发起人原型
public class OriginatorPrototype implements Cloneable {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public OriginatorPrototype createMemto(){
        return this.clone();
    }

    public void restoreMemento(OriginatorPrototype originatorPrototype){
        this.setState(originatorPrototype.getState());
    }

    public OriginatorPrototype clone(){
        try {
            return (OriginatorPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
