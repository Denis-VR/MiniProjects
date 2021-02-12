package project_8_colletion_framework.Interfaces;

import project_8_colletion_framework.Car;

public interface CarSet extends CarCollection {
    boolean add(Car car);

    boolean remove(Car car);

    int size();

    void clear();
}
