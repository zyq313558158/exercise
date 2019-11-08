package behavioralPattern.statePattern.statePatternExtension;

import java.util.HashMap;

//环境类
public class ShareContext {
    private ShareState shareState;
    private HashMap<String,ShareState> shareStateHashMap = new HashMap<>();
    public ShareContext(){
        shareState = new ConcreteState1();
        shareStateHashMap.put("1",shareState);
        shareState = new ConcreteState2();
        shareStateHashMap.put("2",shareState);
    }

    //读取状态
    public ShareState getShareState(String key) {
        return shareStateHashMap.get(key);
    }

    //设置新状态
    public void setShareState(ShareState shareState) {
        this.shareState = shareState;
    }

    //对请求做处理
    public void handle(){
        shareState.handle(this);
    }
}
