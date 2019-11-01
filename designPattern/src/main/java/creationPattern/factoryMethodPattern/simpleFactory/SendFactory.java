package creationPattern.factoryMethodPattern.simpleFactory;

public class SendFactory {
    public Sender produce(String type){
        if ("sms".equals(type)){
            return  new SmsSender();
        }else if("email".equals(type)){
            return new MailSender();
        }else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }
}
