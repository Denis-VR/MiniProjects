package java_features.lambda.task_5_streamTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamVSparallelStream {
	public static void main(String[] args) {
		List<Float> numbers = new ArrayList<>();

		for (int i = 0; i < 20_000_000; i++) {
			numbers.add((float) i);
		}

		long before = System.currentTimeMillis();
		numbers.parallelStream()
				.map(number -> Math.sin(0.2f+number/5)*Math.cos(0.2f+number/5)
				*Math.cos(0.4f+number/2))
				.collect(Collectors.toList());
		long after = System.currentTimeMillis();
		System.out.println(after - before);

		long before2 = System.currentTimeMillis();
		numbers.stream()
				.map(number -> Math.sin(0.2f+number/5)*Math.cos(0.2f+number/5)
						*Math.cos(0.4f+number/2))
				.collect(Collectors.toList());
		long after2 = System.currentTimeMillis();
		System.out.println(after2 - before2);
	}
}
