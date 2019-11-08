package structuralPattern.flyWeightPattern;

public class FlyweightPatternTest {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight01 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight02 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight03 = flyweightFactory.getFlyweight("a");
        Flyweight flyweight11 = flyweightFactory.getFlyweight("b");
        Flyweight flyweight12 = flyweightFactory.getFlyweight("b");
        flyweight01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        flyweight02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        flyweight03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        flyweight11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        flyweight12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }

}
