package project_8_colletion_framework.Tests;

import org.junit.Before;
import org.junit.Test;
import project_8_colletion_framework.Car;
import project_8_colletion_framework.Interfaces.CarCollection;
import project_8_colletion_framework.realization.HashSet;

import static org.junit.Assert.*;

public class CarCollectionTest {
    private CarCollection<Car> carCollection;

    @Before
    public void setUp() throws Exception {
        carCollection = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            carCollection.add(new Car("Brand" + i, i));
        }

    }

    @Test
    public void contains() {
        assertTrue(carCollection.contains(new Car("Brand20", 20)));
        assertFalse(carCollection.contains(new Car("Brand200", 20)));
    }

    @Test
    public void testForeach() {
        int index = 0;
//        while(carCollection.iterator().hasNext()) {
//            Car car = carCollection.iterator().next();
//        }
        for (Car car : carCollection) {
            index++;
        }
        assertEquals(100, index);
    }
}