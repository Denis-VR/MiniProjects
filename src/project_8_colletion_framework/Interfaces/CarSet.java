package project_8_colletion_framework.Interfaces;

public interface CarSet<T> extends CarCollection<T> {
    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();
}
