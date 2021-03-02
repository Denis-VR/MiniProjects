package java_features.inputOutput;

import java.io.*;
import java.util.Scanner;

public class InputOutputFile {
	public static void main(String[] args) throws IOException {
		File file = new File("resources/task_1_trainingIO/test.txt");

		System.out.println("Введите имя");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file, true))) {
			while(!name.equals("End")) {
				out.write(name.getBytes());
				out.write("\n".getBytes());
				name = scanner.nextLine();
			}
			String text = MyIO.readTextFile(file);
			System.out.println(text);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
