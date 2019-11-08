package behavioralPattern.templateMethodPattern.templateMethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.TemplateMethod();
    }
}
