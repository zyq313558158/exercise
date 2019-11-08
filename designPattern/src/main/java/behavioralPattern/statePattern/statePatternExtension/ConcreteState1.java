package behavioralPattern.statePattern.statePatternExtension;

//具体状态1类
public class ConcreteState1 extends ShareState {
    @Override
    public void handle(ShareContext shareContext) {
        System.out.println("当前状态是： 状态1......");
        shareContext.setShareState(shareContext.getShareState("2"));
    }
}
