package demo;

import java.util.concurrent.locks.ReentrantLock;

public class TestTicket implements Runnable{
    private int count = 100;
    ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (count > 0){
            //如果线程不休眠,测试结果将会不明显,有可能1-2个线程(窗口)完成所有票的售卖
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                reentrantLock.lock();
                sale();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }


        }
    }

    private void sale() {
        if (count > 0){
            System.out.println(Thread.currentThread().getName()+"正在出售第" + (100 - count + 1)
                    + "张票");
            count--;
        }
    }

    public static void main(String[] args) {
        TestTicket testTicket = new TestTicket();
        Thread[] threads = new Thread[10];
        for (int i = 0;i < 10;i++){
            threads[i] = new Thread(testTicket,"窗口"+i);
            threads[i].start();
        }
    }
}
