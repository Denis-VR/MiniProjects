package java_features.concurrency_training.task_3_threads_start;

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
