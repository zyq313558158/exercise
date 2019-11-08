package behavioralPattern.vistorPattern;

public class VisitorPatternTest {
    public static void main(String[] args) {
        //Visitor visitor = new ConcreteVisitorA();
        //visitor.visit(new ConcreteElementA());

        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(elementA);
        objectStructure.add(elementB);
        objectStructure.accept(new ConcreteVisitorA());
        objectStructure.accept(new ConcreteVisitorB());
    }
}
