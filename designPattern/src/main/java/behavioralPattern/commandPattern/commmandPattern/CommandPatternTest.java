package behavioralPattern.commandPattern.commmandPattern;

public class CommandPatternTest {
    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.call();
    }


}
