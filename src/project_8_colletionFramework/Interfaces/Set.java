package project_8_colletionFramework.Interfaces;

public interface Set<T> extends Collection<T> {
    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();
}
