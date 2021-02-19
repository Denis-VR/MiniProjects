package java_features.concurrency.task_1_something.inputOutput;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        new FileOutputStream(new File("MyFile")).write(
                "Hello, it's information for File".getBytes()
        );

        new FileOutputStream(new File("MyNewFile"), true)
                .write("Текст для добавления".getBytes());

        BufferedInputStream input = new BufferedInputStream(new FileInputStream
                (new File("MyNewFile")));
        int i;
        String textInFile = "";
        while ((i = input.read()) != -1) {
            textInFile += (char) i;
        }
        InputStream is = new ByteArrayInputStream(textInFile.getBytes());
        System.setIn(is);
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        int id = -1;
        while (true) {
            String line = file.readLine();
            if (line == null) break;
            int newId = Integer.parseInt(line.substring(0, 8));
            if (newId > id) id = newId;
        }
        System.out.println(id);
    }
}
