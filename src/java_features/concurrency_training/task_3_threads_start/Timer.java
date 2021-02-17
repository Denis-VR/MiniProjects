package java_features.concurrency_training.task_3_threads_start;

public class Timer implements Runnable{
    @Override
    public void run() {
        int seconds = 0;
        try {
            while (true) {
                System.out.println(seconds++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }
}
