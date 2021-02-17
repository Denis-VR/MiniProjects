package project_8_colletion_framework.Tests;

import org.junit.Before;
import org.junit.Test;
import project_8_colletion_framework.Car;
import project_8_colletion_framework.CarOwner;
import project_8_colletion_framework.Interfaces.Map;
import project_8_colletion_framework.realizations.HashMap;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class CarMapTest {
    private Map<CarOwner, Car> map;
    private CarOwner owner;
    private CarOwner owner2;
    private Car car;
    private Car car2;


    @Before
    public void setUp() throws Exception {
        map = new HashMap<>();
        owner = new CarOwner(666, "Len", "Teplo");
        car = new Car("Tesla", 983);
        owner2 = new CarOwner(777, "Job", "Vanish");
        car2 = new Car("Model X", 1337);
        map.put(owner, car);
        map.put(owner2, car2);
    }

    @Test
    public void put() {
        int before = map.size();
        CarOwner owner3 = new CarOwner(7377, "Jo3b", "Vani3sh");
        Car car = new Car("Model 3X", 13347);
        map.put(owner3, car);
        assertEquals(before + 1, map.size());
    }

    @Test
    public void get() {
        Car retrunCar = map.get(owner);
        assertTrue(retrunCar.equals(car));
    }

    @Test
    public void keySet() {
        Set<CarOwner> owners;
        owners = map.keySet();
        assertTrue(owners.contains(owner));
        assertTrue(owners.contains(owner2));
    }

    @Test
    public void values() {
        List<Car> cars;
        cars = map.values();
        assertTrue(cars.contains(car));
        assertTrue(cars.contains(car2));
    }

    @Test
    public void remove() {
        int before = map.size();
        assertTrue(map.remove(owner2));
        assertFalse(map.remove(owner2));
    }

    @Test
    public void size() {
        map.clear();
        for (int i = 0; i < 100; i++) {
            map.put(new CarOwner(i, "Name" + i, "LastName" + i),
                    new Car("Brand" + i, i));
        }
        assertEquals(100, map.size());
    }

    @Test
    public void clear() {
        map.clear();
        assertEquals(0, map.size());
    }

    @Test
    public void whenPut100ElementsWith10DifferentKeysThenSize10() {
        map.clear();
        for (int i = 0; i < 100; i++) {
            int index = i % 10;
            map.put(new CarOwner(index, "Name" + index, "LastName" + index),
                    new Car("Brand" + index, index));
        }
        assertEquals(10, map.size());
    }
}