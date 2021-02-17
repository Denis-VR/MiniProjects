package java_features.concurrency_training.some_tasks_1;

public interface Message {
    void message();

    default void method() {
        System.out.println("Вызван метод по умолчания");
    }
}
