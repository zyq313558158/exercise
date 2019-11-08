package structuralPattern.proxyPattern;

//代理
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (null == realSubject){
            realSubject = new RealSubject();
        }

        preRequest();
        realSubject.request();
        postRequest();
    }

    private void postRequest() {
        System.out.println("访问真实主题之后后续处理......");
    }

    private void preRequest() {
        System.out.println("访问真实主题之前预处理......");
    }
}
