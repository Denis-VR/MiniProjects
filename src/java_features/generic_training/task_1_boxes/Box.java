package java_features.generic_training.task_1_boxes;

public class Box<T> {
    private T object;

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
