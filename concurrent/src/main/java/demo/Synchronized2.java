package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 *@author zyq
 *@date 2020/1/17 11:21
 *@description 同一个类的类锁和对象锁不会同步,因为不是同一种锁
 **/

public class Synchronized2 {
    private static Logger logger = LoggerFactory.getLogger(Synchronized2.class);

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                Synchronized2.mA("1");
            }
        });

        final Synchronized2 synchronized2 = new Synchronized2();
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized2.mB("2");
            }
        });

        //threadA.start();
        //threadB.start();
        methodC();
    }

    public static synchronized void mA(String a) {
        for (int i = 0; i <= 100; i++) {
            logger.info(a);
        }
    }

    public void mB(String b) {
        synchronized(this) {
            for (int i = 0; i <= 100; i++) {
                logger.info(b);
            }
        }
    }

    public static void methodC(){
//        ThreadLocal threadLocal = new ThreadLocal();
//        Integer.compare(1,2);
//        AtomicInteger atomicInteger = new AtomicInteger();
//        atomicInteger.compareAndSet(1,2);

        String initialReference = "initial value referenced";

        AtomicReference<String> atomicStringReference =
                new AtomicReference<String>(initialReference);

        String newReference = "new value referenced";
        boolean exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
        System.out.println("exchanged: " + exchanged);

        exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
        System.out.println("exchanged: " + exchanged);

    }

}
