package structuralPattern.compositePattern;

import java.util.ArrayList;

//抽象构件
public class Composite implements Component {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    @Override
    public void add(Component component) {
        componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentArrayList.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return componentArrayList.get(i);
    }

    @Override
    public void operation() {
        for (Component component:componentArrayList) {
            component.operation();
        }
    }
}
