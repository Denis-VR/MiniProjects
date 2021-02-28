package java_features.other_tasks.dateAndFormat;

public class Solution {
	public static void main(String[] args) {
		I i1 = new R1();
		I i2 = new R2();
		i1.go();
		System.out.println("------------------");
		i2.go();
	}

	interface I {
		void go();
	}

	static class R1 implements I {

		@Override
		public void go() {
			System.out.println("Вызов R1");
		}
	}

	static class R2 implements I {
		@Override
		public void go() {
			System.out.println("Вызов R2");
		}
	}
}
