package project_8_colletion_framework.Interfaces;

import project_8_colletion_framework.Car;
import project_8_colletion_framework.CarOwner;

import java.util.List;
import java.util.Set;

public interface CarMap {
    void put(CarOwner key, Car value);

    Car get(CarOwner key);

    Set<CarOwner> keySet();

    List<Car> values();

    boolean remove(CarOwner key);

    int size();

    void clear();
}
