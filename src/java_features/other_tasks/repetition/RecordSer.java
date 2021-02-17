package java_features.other_tasks.repetition;

import java.io.*;

public class RecordSer implements Serializable {

    private static final long serialVersionUID = 6885781922806810357L;
    public String text;
    transient public String constantText = "This is a constant text";
    public String textB = "Hello, world";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        RecordSer recordOut = new RecordSer();
        System.out.println("Write any text witch will siralizable in file \"data.ser\"");
        recordOut.text = reader.readLine();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            out.writeObject(recordOut);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Program saves your text. Input \"1\" if you want restore file.");

        String userAction = reader.readLine();
        boolean a = userAction.equals("1") ? true : false;
        RecordSer recordIn = new RecordSer();
        if (a) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"))) {
                recordIn = (RecordSer) in.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(recordIn.text + "\n" + recordIn.textB);
    }
}
