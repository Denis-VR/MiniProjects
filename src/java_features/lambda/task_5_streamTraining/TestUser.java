package java_features.lambda.task_5_streamTraining;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class TestUser {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			users.add(new User("User-" + (char) ((int) (Math.random()* 20 + 97)), i + 35));
		}

		users.stream()
				.sorted(Comparator.comparing(User::getName))
				.filter(user -> user.getAge() < 40)
				.limit(3)
				.map(User::getName)
				.forEach(System.out::println);

//		Optional<User> oldest = users.stream()
//				.max((Comparator.comparingInt(User::getAge)));
//		oldest.ifPresentOrElse(System.out::println, () -> System.out.println(
//				"User not found!"
//		));

		users.stream()
				.filter(user1 -> user1.getName().contains("l"))
				.findFirst()
				.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

	}
}
