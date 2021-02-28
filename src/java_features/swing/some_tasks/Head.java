package java_features.swing.some_tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Head {
	JFrame frame;
	JLabel label;
	int x = 0, y = 0;
	boolean flag = true;
	Color color1 = randomColor();
	Color color2 = randomColor();

	public static void main(String[] args) {
		Head head = new Head();
		head.draw();
	}

	public void draw() {
		frame = new JFrame("Color App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton colorButton = new JButton("Change color");
		colorButton.addActionListener(new ColorListener());

		MyDrawPanel panel = new MyDrawPanel();

		label = new JLabel("i'm a label!");
		JButton labelButton = new JButton("Change label");
		labelButton.addActionListener(new LabelListener());

		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		//frame.getContentPane().add(BorderLayout.EAST, labelButton);
		//frame.getContentPane().add(BorderLayout.NORTH, label);
		frame.setSize(350, 350);
		frame.setVisible(true);

		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < 200; i++) {
				if (y == 100) {
					flag = false;
				}
				if (flag) {
					x++;
					y++;
				} else {
					x--;
					y--;
				}
				panel.repaint();
				try {
					Thread.sleep(10);
				} catch (Exception e) {
				}
			}
			flag = true;
		}
	}

	class LabelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("I was clicked");
		}
	}

	class ColorListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			color1 = randomColor();
			color2 = randomColor();
		}
	}

	public class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			Graphics2D gg = (Graphics2D) g;
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			//Image image = new ImageIcon("Drawing/cat.jpg").getImage();
			//u8g.drawImage(image, 2,4, this);

			GradientPaint gradient11 = new GradientPaint(70, 70, color1, 150, 150, color2);

			gg.setPaint(gradient11);
			gg.fillOval(x, y, 150, 150);
		}
	}

	static public Color randomColor() {
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);

		Color randomColor = new Color(red, green, blue);
		return randomColor;
	}
}
