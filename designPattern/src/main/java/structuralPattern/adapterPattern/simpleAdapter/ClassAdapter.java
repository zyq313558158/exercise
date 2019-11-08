package structuralPattern.adapterPattern.simpleAdapter;

//类适配器类
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
