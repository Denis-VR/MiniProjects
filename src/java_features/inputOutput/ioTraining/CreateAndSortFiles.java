package java_features.inputOutput.ioTraining;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class CreateAndSortFiles {
	public static void main(String[] args) throws IOException {
		String path = "resources/task_1_trainingIO";
		File directory = new File(path);
		if(directory.mkdirs()) System.out.println("Создана директория: " +
				directory.getName());
		ArrayList<File> filesList = new ArrayList<>();
		filesList.add(new File(directory + "/bigFile.txt"));
		filesList.add(new File(directory + "/file2.md"));
		filesList.add(new File(directory + "/file3.jpg"));

		for (File file : filesList) {
			if (file.createNewFile()) System.out.println("Создан файл: " +
					file.getName());
		}

		File[] files = directory.listFiles((dir, name) -> name.startsWith("f"));

		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}

	}

}
