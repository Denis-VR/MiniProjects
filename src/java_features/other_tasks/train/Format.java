package java_features.other_tasks.train;

class Format {
	public static final int NUM_O;

	static {
		NUM_O = 4;
	}

	public static void main(String[] args) {
		long k;
		System.out.println(String.format("%c", 426));
		System.out.println(String.format("Мне нужно исправить %,6.1f ошибки.", 42222266.000));
		int one = 443478397;
		double two = 39848539.24859;
		int three = 34;
		int four = 4352;
		int five = 4325;
		System.out.println(String.format("Уровень %,d из %,.2f а также %,d или %,d или %,d", one, two, three, four, five));
	}

}
