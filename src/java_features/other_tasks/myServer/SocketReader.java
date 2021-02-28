package java_features.other_tasks.myServer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketReader {
	Socket chatSocket;
	JFrame frame;
	BufferedReader reader;

	public static void main(String[] args) throws IOException {
		SocketReader reader = new SocketReader();
		reader.go();
	}

	public void go() throws IOException {
		JPanel panel = new JPanel();
		chatSocket = new Socket("127.0.0.2", 5000);
		reader = new BufferedReader(new InputStreamReader(chatSocket.getInputStream()));
		String message = reader.readLine();

		PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());

		frame = new JFrame("Chat");
		JTextArea inputText = new JTextArea(50, 200);
		JTextArea outputText = new JTextArea(20, 200);

		JButton send = new JButton("Send");
		send.addActionListener(new SendListener());

		frame.add(panel);
		frame.setVisible(true);

	}

	class SendListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

}
