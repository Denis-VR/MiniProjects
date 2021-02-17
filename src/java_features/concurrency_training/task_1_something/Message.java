package java_features.concurrency_training.task_1_something;

public interface Message {
    void message();

    default void method() {
        System.out.println("Вызван метод по умолчания");
    }
}
