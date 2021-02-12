package java_features.threads_training.clock;

class Clock implements Runnable {
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tik");

            if (!ClockManager.isClockRun) return;
        }
    }
}
