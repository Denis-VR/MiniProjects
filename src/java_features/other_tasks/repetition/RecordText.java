package java_features.other_tasks.repetition;

import java.io.*;

public class RecordText {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("data.txt");
		writer.write("Hello! How are you?");
		writer.close();

		File f = new File("New_Data.txt");
//        f.mkdir();
//        if (f.isDirectory()) {
//            String[] fContents = f.list();
//            for (int i = 0; i < fContents.length; i++) {
//                System.out.println(fContents[i]);
//            }
//        }
//        System.out.println("An absolute path: " + f.getAbsolutePath());
//        boolean isDeleted = f.delete();
		BufferedWriter writerBuf = new BufferedWriter(new FileWriter(f));
		writerBuf.write("Hello, it's message record to buffer");
		writerBuf.close();
	}
}
