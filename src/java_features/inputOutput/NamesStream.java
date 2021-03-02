package java_features.inputOutput;

import java.io.*;
import java.util.Arrays;

public class NamesStream {
	public static void main(String[] args) {
		File file = new File("resources/task_2_namesList/names.txt");

		String string = MyIO.readTextFile(file);
		String[] names = string.split("\n");

		Arrays.stream(names)
				.filter(name -> name.startsWith("Ан"))
				.forEach(System.out::println);

	}
}
