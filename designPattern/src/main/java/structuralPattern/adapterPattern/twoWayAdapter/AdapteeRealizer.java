package structuralPattern.adapterPattern.twoWayAdapter;

//适配者实现
public class AdapteeRealizer implements TwoWayAdaptee {
    @Override
    public void request() {
        System.out.println("适配者代码被调用......");
    }
}
