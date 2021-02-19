package java_features.concurrency.task_1_something;

public class Viber implements Message, Application {
    private int secret = 777;

    @Override
    public void application() {
        System.out.println("Viber application...");
    }

    @Override
    public void message() {
        System.out.println("Viber message...");
        System.out.println(secret);
    }
}

