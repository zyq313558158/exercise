package structuralPattern.adapterPattern.twoWayAdapter;

//目标实现
public class TargetRealizer implements TwoWayTarget {
    @Override
    public void specificRequest() {
        System.out.println("目标代码被调用......");
    }
}
