package creationPattern.buliderPattern;

public class ConcreteBuilder extends Builder {
    @Override
    public void builderPartA() {
        product.setPartA("建造PartA");
    }

    @Override
    public void builderPartB() {
        product.setPartB("建造PartB");
    }

    @Override
    public void builderPartC() {
        product.setPartC("建造PartC");
    }
}
