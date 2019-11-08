package structuralPattern.adapterPattern.twoWayAdapter;

//双向适配器
public class TwoWayAdapter implements TwoWayTarget,TwoWayAdaptee {
    private TwoWayTarget twoWayTarget;
    private TwoWayAdaptee twoWayAdaptee;

    public TwoWayAdapter(TwoWayAdaptee twoWayAdaptee) {
        this.twoWayAdaptee = twoWayAdaptee;
    }

    public TwoWayAdapter(TwoWayTarget twoWayTarget) {
        this.twoWayTarget = twoWayTarget;
    }

    @Override
    public void request() {
        twoWayTarget.specificRequest();
    }

    @Override
    public void specificRequest() {
        twoWayAdaptee.request();
    }
}
