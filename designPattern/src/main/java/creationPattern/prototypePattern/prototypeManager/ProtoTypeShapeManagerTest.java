package creationPattern.prototypePattern.prototypeManager;

public class ProtoTypeShapeManagerTest {
    public static void main(String[] args) {
        ProtoTypeManager protoTypeManager = new ProtoTypeManager();
        Shape shape1 = protoTypeManager.getShape("Circle");
        shape1.countArea();

        Shape shape2 = protoTypeManager.getShape("Square");
        shape2.countArea();
    }
}
