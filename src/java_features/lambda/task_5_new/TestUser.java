package java_features.lambda.task_5_new;

import java.util.ArrayList;
import java.util.List;

public class TestUser {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			users.add(new User("User-" + i, i + 20));
		}

//		int count = users.stream()
//				.filter(user -> user.getAge() > 30)
	}
}
