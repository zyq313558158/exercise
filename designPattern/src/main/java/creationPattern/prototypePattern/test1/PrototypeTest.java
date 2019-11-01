package creationPattern.prototypePattern.test1;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype1 = new Realizetype();
        Realizetype realizetype2 = (Realizetype) realizetype1.clone();
        System.out.println("realizetype1 == realizetype1 ? " + (realizetype1 == realizetype2));
    }

}