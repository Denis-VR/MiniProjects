package java_features.concurrency_training.some_tasks_2;

public class SecondStream implements Runnable {
    static private int number = 0;
    private int name;

    public SecondStream() {
        number++;
        name = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Run " + name + " stream!");
        }
    }
}
