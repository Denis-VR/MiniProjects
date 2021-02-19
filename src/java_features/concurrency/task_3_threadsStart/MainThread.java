package java_features.concurrency.task_3_threadsStart;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        long beforeTime = System.currentTimeMillis();
        System.out.println("Start Main Thread");

        //way 1
//        Thread thread = new SubThread();
//        thread.start();
//        run("Main Thread);

        //way 2
//        Thread thread1 = new Thread(new MyRunnable());
//        thread1.start();
//        run("Main Thread");

        //way3
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long currentTime = System.currentTimeMillis();
                System.out.println("Start Sub Thread");
                for (int i = 0; i < 10; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    System.out.println(i + " (Anon Thread)");
                }
                System.out.println("End Sub Thread - " + (System.currentTimeMillis() - currentTime));
            }
        });
        thread2.start();

        for (int i = 0; i < 10; i++) {
            if (i == 6) thread2.interrupt();
            System.out.println(i + " Main Thread");
        }

        System.out.println("Finish Main Thread - " + (System.currentTimeMillis() - beforeTime));
    }


}
