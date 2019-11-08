package behavioralPattern.statePattern.statePatternExtension;

//具体状态2类
public class ConcreteState2 extends ShareState {
    @Override
    public void handle(ShareContext shareContext) {
        System.out.println("当前状态是： 状态2......");
        shareContext.setShareState(shareContext.getShareState("1"));
    }
}
