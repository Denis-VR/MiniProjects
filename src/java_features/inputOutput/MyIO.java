package java_features.inputOutput;

import java.io.*;

public class MyIO {

	public static String readTextFile(File file) {
		StringBuilder result = null;
		try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
			result = new StringBuilder();
			char[] array = new char[128];
			int count = reader.read(array);
			while(count>0) {
				result.append(new String(array, 0, count));
				count = reader.read(array);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	public static boolean reWriteFile(File file, String string) {
		try(FileOutputStream outputStream = new FileOutputStream(file)) {
			outputStream.write(string.getBytes());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean writeFile(File file, String string) {
		try(FileOutputStream outputStream = new FileOutputStream(file, true)) {
			outputStream.write(string.getBytes());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void checkFile(File file) {
		System.out.println("-------Проверка-файла-------");
		System.out.println("Имя файла: " + file.getName());
		System.out.println("Файл существует: " + file.exists());
		System.out.println("Это директория: " + file.isDirectory());
		System.out.println("Это file: " + file.isFile());
		System.out.println("----------------------------");
	}
}
