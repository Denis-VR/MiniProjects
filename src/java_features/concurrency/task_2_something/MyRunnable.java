package java_features.concurrency.task_2_something;

public class MyRunnable implements Runnable {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread thread = new Thread(threadJob);
        thread.start();
//        while (true) {
//            System.out.println("Noooo");
//            try {
//                Thread.sleep(301);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Two");

        }
    }

    @Override
    public void run() {
//        while (true) {
//            System.out.println("Stream");
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        for (int i = 0; i < 5; i++) {
            System.out.println("One");
        }
    }
}