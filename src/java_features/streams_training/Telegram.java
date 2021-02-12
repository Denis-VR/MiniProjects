package java_features.streams_training;

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
