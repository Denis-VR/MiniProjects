package java_features.threads_training;

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
        System.out.println("Сейчас работает " + Thread.currentThread().getName());
    }
}
