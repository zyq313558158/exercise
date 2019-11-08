package structuralPattern.flyWeightPattern;

//抽象享元角色
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight);
}
