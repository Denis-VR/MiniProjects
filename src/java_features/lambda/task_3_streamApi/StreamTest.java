package java_features.lambda.task_3_streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamTest {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add( (int) (Math.random()*100 + 100));
		}

		List<String> result = list.stream()
				.filter(n -> n % 5 == 0 && n % 2 == 0)
				.map(Math::sqrt )
				.map(StreamTest::mapToString)
				.collect(Collectors.toList());
		for (String s : result) {
			System.out.println(s);
		}

	}

	public static String mapToString(double a) {
		return "Sqrt: " + a;
	}
}
