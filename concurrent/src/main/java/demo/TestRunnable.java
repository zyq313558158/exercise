package demo;

public class TestRunnable implements Runnable{

    @Override
    public void run() {
        doSomeThing();
    }

    private void doSomeThing() {
        System.out.println("我是TestRunnable线程方法");
    }

    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        Thread thread = new Thread(testRunnable);
        thread.start();
    }
}
