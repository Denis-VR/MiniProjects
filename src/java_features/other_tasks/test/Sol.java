package java_features.other_tasks.test;

public class Sol {
	public static void main(String[] args) {
	}

	interface A {
		default void test() {
			System.out.println("A");
		}
	}

	interface B {
		default void test() {
			System.out.println("B");
		}
	}
}
