package creationPattern.buliderPattern;

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    //显示产品的特性
    public void show(){
        System.out.println("product[partA:"+partA+";partB:"+partB+";partC:"+partC+"]");
    }
}
