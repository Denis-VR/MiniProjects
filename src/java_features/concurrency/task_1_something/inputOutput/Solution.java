package java_features.concurrency.task_1_something.inputOutput;

import java.io.*;

/*
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        if (args.length == 4) {
            //Прочтем информацию из файла в переменную String
            BufferedInputStream input = new BufferedInputStream(new FileInputStream(fileName));
            int i;
            String textInFile = "";
            while ((i = input.read()) != -1) {
                textInFile += (char) i;
            }

            //Найдем максимальный id
            InputStream is = new ByteArrayInputStream(textInFile.getBytes());
            System.setIn(is);
            BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
            int id = -1;
            while (true) {
                String line = file.readLine();
                if (line == null) break;
                //if (line.length() > 7) {
                int newId = Integer.parseInt(line.substring(0, 8).trim());
                if (newId > id) id = newId;
                //}
            }
            id++;

            FileWriter fIn = new FileWriter(fileName, true);
            fIn.write("\n" + right(id + "", 8) + right(args[1], 30) + right(args[2] + "", 8) + right(args[3] + "", 4));

            is.close();
            file.close();
            input.close();
            fIn.close();
        }

    }

    public static String right(String s, int length) {
        if (s.length() > length) return s.substring(0, length);
        while (s.length() != length) {
            s = s + " ";
        }
        return s;
    }
}
