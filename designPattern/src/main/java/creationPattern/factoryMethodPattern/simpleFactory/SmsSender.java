package creationPattern.factoryMethodPattern.simpleFactory;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender");
    }
}
