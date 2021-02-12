package java_features.streams_training;

import java.io.*;

public class Reader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedInputStream fileReader = new BufferedInputStream(new FileInputStream(fileName));
            while (fileReader.available() > 0) {
                System.out.println(fileReader.read());
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Ошибочка");
        }
    }
}
