package java_features.threads_training.clock;

public class ClockManager {
    public static boolean isClockRun = true;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(3000);
        isClockRun = false;
    }

}
