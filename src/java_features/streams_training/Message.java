package java_features.streams_training;

public interface Message {
    void message();

    default void method() {
        System.out.println("Вызван метод по умолчания");
    }
}
