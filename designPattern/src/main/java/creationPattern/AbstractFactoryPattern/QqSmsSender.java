package creationPattern.AbstractFactoryPattern;

public class QqSmsSender implements SmsSender {
    @Override
    public void Send() {
        System.out.println("this is qq sms Sender");
    }
}
