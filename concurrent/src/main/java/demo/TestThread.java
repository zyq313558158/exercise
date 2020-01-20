package demo;

public class TestThread extends Thread{

    @Override
    public void run() {
        //super.run();
        doSomething();
    }

    private void doSomething() {
        System.out.println("我是TestThread线程中的方法");
    }

    public static void main(String[] args) {
        Thread testThread = new TestThread();
        testThread.start();
    }
}
