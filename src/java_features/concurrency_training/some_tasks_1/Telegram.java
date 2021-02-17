package java_features.concurrency_training.some_tasks_1;

public class Telegram implements Message, Application {
    @Override
    public void application() {
        System.out.println("Telegram application...");
    }

    @Override
    public void message() {
        System.out.println("Telegram message...");
    }
}
