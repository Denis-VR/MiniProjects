package project_8_colletion_framework.Interfaces;

public interface CarCollection<T> extends Iterable<T> {

    boolean remove(T car);

    boolean add(T car);

    int size();

    void clear();

    boolean contains(T car);
}



