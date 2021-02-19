package java_features.concurrency.task_2_something;

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        Thread alpha = new Thread(new RunThreads());
        Thread beta = new Thread(new RunThreads());

        alpha.setName("поток альфа");
        beta.setName("поток бета");
        alpha.start();
        beta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            System.out.println(i + ". Сейчас работает " + Thread.currentThread().getName());
        }
    }
}
