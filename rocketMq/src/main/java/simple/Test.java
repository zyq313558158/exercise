package simple;

import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] aaa= ("Hello RocketMQ " + 0).getBytes(RemotingHelper.DEFAULT_CHARSET);
        for (byte b:aaa) {
            System.out.println(b);
        }
    }
}
