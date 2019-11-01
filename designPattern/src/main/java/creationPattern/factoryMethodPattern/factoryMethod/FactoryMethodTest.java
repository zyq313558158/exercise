package creationPattern.factoryMethodPattern.factoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new MailFactory();
        Sender sender = senderFactory.produce();
        sender.Send();
    }

}
