package creationPattern.factoryMethodPattern.factoryMethod;

public class SmsFactory implements SenderFactory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
