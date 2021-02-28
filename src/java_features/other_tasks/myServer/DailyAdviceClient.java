package java_features.other_tasks.myServer;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {

	String[] adviceList = {"Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают вас полнее.",
			"Два слова: не годится", "Будьте честны хотя бы сегодня. Скажите своему начальнику все, что вы *на самом деле*" +
			" о нем думаете.", "Возможно, вам стоит подобрать другую прическу."};

	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242);

			while (true) {
				Socket sock = serverSock.accept();

				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}

//            Socket s = new Socket("127.0.0.1", 4242);
//            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
//
//            String advice = reader.readLine();
//            System.out.println("Сегодня ты должен: " + advice);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}

	public static void main(String[] args) {
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}
}
