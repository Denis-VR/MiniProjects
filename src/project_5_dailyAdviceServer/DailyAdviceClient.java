package project_5_dailyAdviceServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String advice = reader.readLine();
            System.out.println("Сегодня ты должен: " + advice);
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
