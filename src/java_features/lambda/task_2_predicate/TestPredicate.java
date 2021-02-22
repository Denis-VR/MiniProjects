package java_features.lambda.task_2_predicate;

import java.util.ArrayList;
import java.util.List;

public class TestPredicate {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 96; i++) {
			numbers.add((int) (Math.random() * 900 + 100));
		}

		List<Integer> filtered = filter(numbers, (n) -> n > 0);
		List<String> mapped = map(filtered);

		int i = 0;
		for (String s : mapped) {
			if (i % 16 == 0) System.out.println();
			System.out.print(s + " | ");
			i++;
		}

	}

	private static List<String> map(List<Integer> numbers) {
		List<String> result = new ArrayList<>();
		for (int number : numbers) {
			result.add(String.valueOf(number));
		}
		return result;
	}

	private static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
		List<Integer> result = new ArrayList<>();
		for (int i : list) {
			if (predicate.test(i)) result.add(i);
		}
		return result;
	}

}
