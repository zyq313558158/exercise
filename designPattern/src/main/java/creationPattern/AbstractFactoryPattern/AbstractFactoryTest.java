package creationPattern.AbstractFactoryPattern;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        SenderFactory weiXinSendFactory = new WeiXinSendFactory();
        SmsSender weiXinSmsSender = weiXinSendFactory.produceSmsSender();
        weiXinSmsSender.Send();

        SenderFactory senderFactory = new QqSendFactory();
        EmailSender emailSender = senderFactory.produceEmailSender();
        emailSender.Sender();
    }
}
