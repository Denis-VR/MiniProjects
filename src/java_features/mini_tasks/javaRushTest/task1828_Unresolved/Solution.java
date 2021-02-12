package java_features.mini_tasks.javaRushTest.task1828_Unresolved;

import java.io.*;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader input = new BufferedReader(new FileReader(fileName));
        BufferedReader input2 = new BufferedReader(new FileReader(fileName));
        BufferedWriter output = new BufferedWriter(new FileWriter(fileName));
        //TODO попробовать убрать new File()
        BufferedWriter temp_out = new BufferedWriter(new FileWriter(new File("temp.txt")));
        BufferedReader temp_in = new BufferedReader(new FileReader("temp.txt"));
        String text;
        while ((text = input2.readLine()) != null) {
            temp_out.write(text);
        }
        //text.
        if (args.length == 5) { //TODO добавить equals, елси ошибка
            String textInFile = "";
            int id = -1;
            while ((textInFile = input.readLine()) != null) {
                int newId = Integer.parseInt(textInFile.substring(0, 8).trim());
                if (newId == Integer.parseInt(args[2])) {
                    //TODO обновить строчку
                    //output.;
                }
            }
        } else if (args.length == 2) { //TODO добавить equals, если ошибка

        }

        input.close();
        output.close();
        temp_out.close();
    }

    public static String right(String s, int length) {
        if (s.length() > length) return s.substring(0, length);
        while (s.length() != length) {
            s = s + " ";
        }
        return s;
    }
}
