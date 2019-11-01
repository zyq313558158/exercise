package creationPattern.AbstractFactoryPattern;

public class WeiXinSendFactory implements SenderFactory {
    @Override
    public EmailSender produceEmailSender() {
        return new WeiXinEamilSender();
    }

    @Override
    public SmsSender produceSmsSender() {
        return new WeiXinSmsSender();
    }
}
