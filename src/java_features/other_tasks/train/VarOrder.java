package java_features.other_tasks.train;

class VarOrder {
	public int a = getSum() + 5;
	public int b = getSum() - a + 2;
	public int c = getSum() - a - b;


	public int getSum() {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println((new VarOrder()).a);
		System.out.println((new VarOrder()).c);
		System.out.println((new VarOrder()).b);
	}
}
