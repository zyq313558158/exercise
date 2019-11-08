package structuralPattern.decoratorPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("-----------------------------");
        Component component1 = new ConcreteDecorator(component);
        component1.operation();
    }
}
