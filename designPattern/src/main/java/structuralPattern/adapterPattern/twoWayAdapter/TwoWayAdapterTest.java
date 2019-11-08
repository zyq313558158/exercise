package structuralPattern.adapterPattern.twoWayAdapter;

//客户端代码
public class TwoWayAdapterTest {
    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee adaptee = new AdapteeRealizer();
        TwoWayTarget target = new TwoWayAdapter(adaptee);
        target.specificRequest();

        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");

        target = new TargetRealizer();
        adaptee = new TwoWayAdapter(target);
        adaptee.request();
    }
}
