package java_features.lambda.task_2_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SameThingWithStreamAPI {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 96; i++) {
			numbers.add((int) (Math.random() * 900 + 100));
		}

		List<String> list = numbers.stream()
				.filter(i -> i % 2 == 0)
				.map(integer -> String.valueOf(integer))
				.filter(str -> str.endsWith("0"))
				.map(str -> str + " ")
				.collect(Collectors.toList());

		for (String s : list) {
			System.out.print(s);
		}

	}
}
