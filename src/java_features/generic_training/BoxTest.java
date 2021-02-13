package java_features.generic_training;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<Integer> box1 = new Box<>(20);
        Box<Integer> box2 = new Box<>(10);
        int expected = 30;
        int result = box1.getObject() + box2.getObject();
        assertEquals(expected, result);
    }

    @Test
    public void testBigBox() {
        DoubleBox<String, Integer> box1 = new DoubleBox<>("String", 10);
        DoubleBox<String, Integer> box2 = new DoubleBox<>("String", 10);
        int result = box1.getValue() + box2.getValue();
        assertEquals(20, result);
    }
}
