package project_8_colletion_framework.Interfaces;

import project_8_colletion_framework.Car;

public interface CarQueue extends CarCollection {
    boolean add(Car car);

    Car peek();

    Car poll();
}
