package creationPattern.factoryMethodPattern.factoryMethod;

public class MailFactory implements SenderFactory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
