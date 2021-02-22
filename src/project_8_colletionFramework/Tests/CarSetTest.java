package project_8_colletionFramework.Tests;

import org.junit.Before;
import org.junit.Test;
import project_8_colletionFramework.Car;
import project_8_colletionFramework.Interfaces.CarSet;
import project_8_colletionFramework.realizations.CarHashSet;

import static org.junit.Assert.*;

public class CarSetTest {
    private CarSet<Car> carSet;

    @Before
    public void setUp() {
        carSet = new CarHashSet<>();
    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("Brand" + i, i));
        }
        assertEquals(100, carSet.size());
    }

    @Test
    public void whenElementRemovedThenSizeMustBeDecreased() {
        Car car = new Car("L", 1);
        carSet.add(car);
        int sizeBefore = carSet.size();
        boolean success = carSet.remove(car);
        int sizeAfter = carSet.size();
        assertEquals(sizeBefore - 1, sizeAfter);
    }

    @Test
    public void CheckForUniqueness() {
        int sizeBefore = carSet.size();
        assertTrue(carSet.add(new Car("X", 4)));
        assertFalse(carSet.add(new Car("X", 4)));
        assertFalse(carSet.add(new Car("X", 4)));
        int sizeAfter = carSet.size();
        assertEquals(sizeBefore + 1, sizeAfter);
    }

    @Test
    public void CheckMethodClear() {
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("Brand" + i, i));
        }
        carSet.clear();
        assertEquals(0, carSet.size());
    }

    @Test
    public void whenAddCarThenListContainsThisCar() {
        Car car = new Car("LSD", 1);
        Car car2 = new Car("WOW", 1);
        carSet.add(car);
        carSet.add(car2);
        assertTrue(carSet.contains(car));
    }

    @Test
    public void whenListNotContainCarThenReturnFalse() {
        Car car = new Car("LSD", 1);
        assertFalse(carSet.contains(car));
    }
}