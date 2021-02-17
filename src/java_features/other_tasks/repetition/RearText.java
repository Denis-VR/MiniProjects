package java_features.other_tasks.repetition;

import java.io.*;

public class RearText {
    public static void main(String[] args) throws IOException {
        try {
            File myFile = new File("data.ser");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader); //TODO reduce

            String line = null;//TODO clear null
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
