package java_features.inputOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputOutputFile {
	public static void main(String[] args) {
		File file = new File("resources/task_1_trainingIO/test.txt");
		try(FileOutputStream outputStream = new FileOutputStream(file)) {
		String mails = "Hello, world!"
				+ "\nHow are you?";
		outputStream.write(mails.getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Reader reader = new InputStreamReader(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
