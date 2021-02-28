package java_features.other_tasks.train;

public class Instanceof {
	public static void main(String[] args) {
		Integer x = 22;
		int k = 32;
		String text = "text";

		check(x);
		check(k);
		check(text);
	}

	static public void check(Object o) {
		System.out.println(o instanceof Integer);
	}
}
