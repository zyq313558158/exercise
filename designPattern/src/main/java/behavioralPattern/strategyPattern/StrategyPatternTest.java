package behavioralPattern.strategyPattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy= new ConcreteStragetyA();
        context.setStrategy(strategy);
        context.strategyMethod();
        System.out.println("----------------------");
        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.strategyMethod();
    }
}
