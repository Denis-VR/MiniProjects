package project_8_colletion_framework.Interfaces;

import project_8_colletion_framework.Car;

public interface CarCollection extends Iterable<Car> {

    boolean remove(Car car);

    boolean add(Car car);

    int size();

    void clear();

    boolean contains(Car car);
}



