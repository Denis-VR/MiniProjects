package java_features.inputOutput;

import java.io.File;
import java.io.RandomAccessFile;;

public class AccessFileTest {
	public static void main(String[] args) {
		File file = new File("resources/task_2_namesList/names.txt");
		try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
			byte[] b = new byte[1024];
			randomAccessFile.read(b);
			System.out.println(new String(b));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
