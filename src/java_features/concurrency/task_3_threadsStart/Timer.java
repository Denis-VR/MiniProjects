package java_features.concurrency.task_3_threadsStart;

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
