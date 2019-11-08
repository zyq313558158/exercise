package behavioralPattern.chainOfResponsibilityPattern;

//具体处理者角色1
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("one".equals(request)){
            System.out.println("具体处理者1负责处理该请求！");
        }else {
            if (null != getNext()){
                getNext().handleRequest(request);
            }else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
