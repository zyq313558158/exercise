package behavioralPattern.mediatorPattern.mediatorPatternExtension;

public class MediatorPatternExtensionTest {
    public static void main(String[] args) {
        SimpleColleague simpleColleague1 = new SimpleConcreteColleague1();
        SimpleColleague simpleColleague2 = new SimpleConcreteColleague2();
        simpleColleague1.send();
        simpleColleague2.send();
        simpleColleague1.send();
    }
}
