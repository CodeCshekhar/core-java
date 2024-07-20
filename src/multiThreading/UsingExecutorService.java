package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable worker = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getId() + " Value " + i);
                }
            }
        };

        executor.execute(worker);
        executor.execute(worker);
        executor.shutdown();
    }
}
