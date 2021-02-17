package project_8_colletion_framework.Tests;

import org.junit.Before;
import org.junit.Test;
import project_8_colletion_framework.Car;
import project_8_colletion_framework.Interfaces.List;
import project_8_colletion_framework.realizations.LinkedList;

import static org.junit.Assert.*;

public class CarListTest {
    private List<Car> carList;

    @Before
    public void setUp() {
        carList = new LinkedList<>();
        // carList = new CarArrayList<>();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {
        assertEquals(100, carList.size());
    }

    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased() {
        assertTrue(carList.removeAt(5));
        assertEquals(99, carList.size());
    }

    @Test
    public void whenElementRemovedThenSizeMustBeDecreased() {
        Car car = new Car("Toyota", 15);
        carList.add(car);
        assertEquals(101, carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void whenNotExistenElementRemovedThenReturnFalse() {
        Car car = new Car("Toyota", 15);
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void whenListCleardThenSizeMustBe0() {
        carList.clear();
        assertEquals(0, carList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBoundsException() {
        carList.get(100);
    }

    @Test
    public void methodGetReturnedRightValue() {
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }

    @Test
    public void insertIntoMiddle() {
        Car car = new Car("BMW", 1);
        carList.add(car, 50);
        Car carFrpmList = carList.get(50);
        assertEquals("BMW", carFrpmList.getBrand());
    }

    @Test
    public void insertIntoFirstPosition() {
        Car car = new Car("BMW", 1);
        carList.add(car, 0);
        Car carFrpmList = carList.get(0);
        assertEquals("BMW", carFrpmList.getBrand());
    }

    @Test
    public void insertIntoLastPosition() {
        Car car = new Car("BMW", 1);
        carList.add(car, 100);
        Car carFromList = carList.get(100);
        assertEquals("BMW", carFromList.getBrand());
    }

    @Test
    public void whenAddCarThenListContainsThisCar() {
        Car car = new Car("LSD", 1);
        Car car2 = new Car("WOW", 1);
        carList.add(car);
        carList.add(car2);
        assertTrue(carList.contains(car));
    }

    @Test
    public void whenListNotContainCarThenReturnFalse() {
        Car car = new Car("LSD", 1);
        assertFalse(carList.contains(car));
    }
}