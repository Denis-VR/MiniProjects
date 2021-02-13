package project_8_colletion_framework.Interfaces;

public interface List<T> extends Collection<T> {
    T get(int index);

    boolean add(T car, int index);

    boolean remove(T car);

    boolean removeAt(int index);

    int size();

    void clear();
}
