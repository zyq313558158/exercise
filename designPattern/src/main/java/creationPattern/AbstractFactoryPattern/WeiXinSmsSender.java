package creationPattern.AbstractFactoryPattern;

public class WeiXinSmsSender implements SmsSender {
    @Override
    public void Send() {
        System.out.println("this is weiXin sms Sender ");
    }
}
