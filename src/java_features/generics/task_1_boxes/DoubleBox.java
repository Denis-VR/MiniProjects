package java_features.generics.task_1_boxes;

public class DoubleBox<K, V> {
     private K key;
     private V value;

    public DoubleBox(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
