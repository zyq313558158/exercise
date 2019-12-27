package orderly;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 *@author zyq
 *@date 2019/12/26 17:41
 *@description RocketMQ 生产者 1.有序(根据对烈数分组) 2.时间延迟消费
 **/

public class RocketMQProducerOrderly {
    public static void main(String[] args) throws UnsupportedEncodingException {
        try {
            // 声明并初始化一个producer
            // 需要一个producer group名字作为构造方法的参数，这里为ordered_producer
            DefaultMQProducer orderedProducer  = new DefaultMQProducer("ordered_producer");

            // 设置NameServer地址,此处应改为实际NameServer地址，多个地址之间用；分隔
            //NameServer的地址必须有，但是也可以通过环境变量的方式设置，不一定非得写死在代码里
            orderedProducer.setNamesrvAddr("192.168.206.128:9876");

            // 调用start()方法启动一个producer实例
            orderedProducer.start();

            // 自定义一个tag数组
            String[] tags = new String[]{"TagA", "TagB", "TagC", "TagD", "TagE"};

            // 发送10条消息到Topic为TopicTestOrdered，tag为tags数组按顺序取值，
            // key值为“KEY”拼接上i的值，消息内容为“Hello RocketMQ”拼接上i的值
            for (int i = 0; i < 10; i++){
                int orderId = i % 10;
                Message message =
                        new Message("TopicTestOrdered",tags[i % tags.length],"KEY"+i,
                                ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));

                // 这里设置需要延时的等级即可
                /*  RcoketMQ的延时等级为：1s，5s，10s，30s，1m，2m，3m，4m，5m，6m，7m，8m，9m，10m，20m，30m，1h，2h。
                level=0，表示不延时。level=1，表示 1 级延时，对应延时 1s。level=2 表示 2 级延时，对应5s，以此类推。  */
                //message.setDelayTimeLevel(5);

                SendResult sendResult = orderedProducer.send(message, new MessageQueueSelector() {
                    public MessageQueue select(List<MessageQueue> list, Message message, Object o) {

                        System.out.println("************List<MessageQueue> size : "+list.size()+"********************");

                        // arg的值其实就是orderId
                        Integer id = (Integer) o;

                        // mqs是队列集合，也就是topic所对应的所有队列
                        int index = id % list.size();

                        // 这里根据前面的id对队列集合大小求余来返回所对应的队列
                        return list.get(index);
                    }
                },orderId);

                System.out.println(sendResult);
            }

            orderedProducer.shutdown();

        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
