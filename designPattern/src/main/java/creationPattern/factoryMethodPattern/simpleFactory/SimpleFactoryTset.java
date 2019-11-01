package creationPattern.factoryMethodPattern.simpleFactory;

public class SimpleFactoryTset {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("sms");
        sender.Send();
    }
}
