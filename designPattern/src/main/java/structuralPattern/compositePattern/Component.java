package structuralPattern.compositePattern;

//抽象构件
public interface Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
    void operation();
}
