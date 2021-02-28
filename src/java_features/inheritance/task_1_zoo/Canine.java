package java_features.inheritance.task_1_zoo;

abstract public class Canine extends Animal {


	public Canine(int energy, int age, String noise, String name) {
		super(energy, age, noise, name);
		System.out.println("Конструктор animal с аргументами");
	}

	public Canine() {
		System.out.println("Конструктор canine без аргументов");
	}


	@Override
	public void sayPu() {
		//super.sayPu();
		System.out.println("Переопределение приватного метода");
		System.out.println("Доступ к приватному методы был потерен");
	}

	@Override
	public void sayPu(String n) {
		super.sayPu(n);
	}
}
