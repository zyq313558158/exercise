package creationPattern.buliderPattern;

abstract class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void builderPartA();
    public abstract void builderPartB();
    public abstract void builderPartC();

    //返回产品对象
    public Product getResult(){
        return product;
    }
}
