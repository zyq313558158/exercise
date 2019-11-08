package structuralPattern.compositePattern;

public class CompositePatternTest {
    public static void main(String[] args) {
        Component component0 = new Composite();
        Component component1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        component0.add(leaf1);
        component0.add(component1);
        component1.add(leaf2);
        component1.add(leaf3);
        component0.operation();
    }
}
