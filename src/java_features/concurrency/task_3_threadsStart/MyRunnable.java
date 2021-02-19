package java_features.concurrency.task_3_threadsStart;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Start Runnable Thread");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " (SubRun Thread)");
        }
        System.out.println("Finish Runnable Thread");
    }
}
