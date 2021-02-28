package java_features.generics.task_1_boxes;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

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

	@Test
	public void testBoxForNumbers() {
		BoxForNumbers<Integer> box = new BoxForNumbers<>(5, 10, 15);
		BoxForNumbers<Float> box2 = new BoxForNumbers<>(5f, 10f, 15f);
		assertEquals(10, box.avg(), 0.0001);
	}

	@Test
	public void testDifferentWildcard() {
		List<Integer> numbers = new ArrayList<>();
		BoxForNumbers.method(numbers);
	}

	@Test
	public void testTransfer() {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		List<Object> numbers2 = new ArrayList<>();
		BoxForNumbers.transfer(numbers, numbers2);

		assertEquals(0, numbers.size());
		assertEquals(10, numbers2.size());
	}
}
