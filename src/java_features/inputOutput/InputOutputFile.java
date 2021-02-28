package java_features.inputOutput;

import java.io.*;

public class InputOutputFile {
	public static void main(String[] args) throws IOException {
		File file = new File("resources/task_1_trainingIO/file1.txt");

		InputStream inputStream = new FileInputStream(file);
		int i = inputStream.read();
		while (i != -1) {
			System.out.print((char) i);
			i = inputStream.read();
		}

	}
}
