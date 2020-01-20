package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Synchronized implements Runnable{

    private Logger logger = LoggerFactory.getLogger(Synchronized.class);

    private final Integer MAX_PRODUCT = 50;
    private final Integer MIN_PRODUCT = 20;
    private Integer product = 0;

    /**
     *@author zyq
     *@date 2020/1/7 16:20
     *@description 会产生死锁(类似但不是)：
     *      1.main方法开始执行时所有线程均依次(必须都结束了produce)第一次执行到消费者,所有线程将进入等待(若线程数小于最小商品数)；
     *      解决：线程数大于最小商品数。
     **/
    public static void main(String[] args) {
        Synchronized s = new Synchronized();
        Thread[] threads = new Thread[2];
        for (Thread thread:threads) {
            thread = new Thread(s);
            thread.start();
        }
    }

    public synchronized void produce(){
        if (this.product >= MAX_PRODUCT){
            try {
                logger.info("产品已满，请稍候再生产");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        this.product++;
        logger.info("生产者生产第" + this.product + "个产品.");
        notifyAll();
    }

    public synchronized void consume(){
        if (this.product <= MIN_PRODUCT){
            try {
                logger.info("缺货,稍候再取");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        logger.info("消费者取走了第" + this.product + "个产品.");
        this.product--;
        notifyAll();
    }

    @Override
    public void run() {
       for (;;){
           produce();
           consume();
       }
    }
}
