package java_features.other_tasks.people;

import java.awt.*;

public class Mini extends Car {
	Color color;
	int age;
	String name;

	public Mini() {
		this((int) (Math.random() * 12));
	}

	public Mini(String name) {
		super(name);
	}

	public Mini(int age) {
		super(age);
		this.age = age;
	}

	public void printH() {
		System.out.println("Hello!");
	}

	public int getAAge() {
		return age;
	}

	public Mini(String name, int age) {


	}
}
