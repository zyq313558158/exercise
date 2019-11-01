package creationPattern.AbstractFactoryPattern;

public interface SenderFactory {
    EmailSender produceEmailSender();
    SmsSender produceSmsSender();
}
