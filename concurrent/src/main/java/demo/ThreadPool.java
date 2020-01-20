package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Synchronized s = new Synchronized();

    }
}
