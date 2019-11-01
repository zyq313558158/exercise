package creationPattern.AbstractFactoryPattern;

public class QqSendFactory implements SenderFactory {
    @Override
    public EmailSender produceEmailSender() {
        return new QqEmailSender();
    }

    @Override
    public SmsSender produceSmsSender() {
        return new QqSmsSender();
    }
}
