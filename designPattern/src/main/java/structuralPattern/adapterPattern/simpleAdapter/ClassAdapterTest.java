package structuralPattern.adapterPattern.simpleAdapter;

//客户端代码
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器测试.......");
        Target target = new ClassAdapter();
        target.request();
    }
}
