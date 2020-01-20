package demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable {
    @Override
    public Object call() throws Exception {
        doSomeThing();
        return "succxx";
    }

    private void doSomeThing() {
        System.out.println("我是TestCallable线程中的方法");
    }

    public static void main(String[] args) {
        Callable callable = new TestCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            String string = (String) futureTask.get();
            System.out.println(string);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
