package structuralPattern.adapterPattern.simpleAdapter;

//客户端代码
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器加载测试......");
        Adaptee adapter = new Adaptee();
        Target target = new ObjectAdapter(adapter);
        target.request();
    }
}
