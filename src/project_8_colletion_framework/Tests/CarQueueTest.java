package project_8_colletion_framework.Tests;

import org.junit.Before;
import org.junit.Test;
import project_8_colletion_framework.Car;
import project_8_colletion_framework.Interfaces.CarQueue;
import project_8_colletion_framework.realization.CarLinkedList;

import static org.junit.Assert.*;

public class CarQueueTest {

    private CarQueue queue;

    @Before
    public void setUp() throws Exception {
        queue = new CarLinkedList();
        for (int i = 0; i < 10; i++) {
            queue.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void add() {
        assertEquals(10, queue.size());
    }

    @Test
    public void peek() {
        Car car = queue.peek();
        assertEquals("Brand0", car.getBrand());
        assertEquals(10, queue.size());
    }

    @Test
    public void poll() {
        Car car = queue.poll();
        assertEquals("Brand0", car.getBrand());
        assertEquals(9, queue.size());
    }
}