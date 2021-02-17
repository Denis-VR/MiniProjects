package java_features.swing_training.some_tasks;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Comp {
    JTextField field;
    JTextArea text;
    JCheckBox check;
    JList list;

    public static void main(String[] args) {
        Comp comp = new Comp();
        comp.go();
    }

    public void go() {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.red);

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.getContentPane().add(BorderLayout.EAST, panel);
        JPanel panelNorth = new JPanel();
        //panelNorth.setLayout(new BoxLayout(panelNorth, BoxLayout.X_AXIS));
        panelNorth.setBackground(Color.GRAY);
        frame.getContentPane().add(BorderLayout.NORTH, panelNorth);

        JLabel label = new JLabel("Input please:");
        panelNorth.add(label);

        field = new JTextField(22);
        field.addActionListener(new InputTextListener());
        field.setText("Выделенный текст по умолчанию");
        field.selectAll();
        panelNorth.add(field);

        text = new JTextArea(4, 20);
        JScrollPane scroller = new JScrollPane(text);
        text.setLineWrap(true);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        text.selectAll();
        text.requestFocus();
        frame.getContentPane().add(BorderLayout.SOUTH, scroller);

        Font littleFont = new Font("serif", Font.BOLD, 8);
        Font bigFont = new Font("serif", Font.BOLD, 20);

        JButton button = new JButton("Add text");
        button.setFont(littleFont);
        button.addActionListener(new AddText());
        JButton button1 = new JButton("Add input text");
        button1.addActionListener(new AddInputText());
        JButton button2 = new JButton("shock me");
        button2.setFont(bigFont);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        check = new JCheckBox("Goes to 11");
        check.addItemListener(new ItemListen());
        panel.add(check);

        JPanel panelWest = new JPanel();
        panelWest.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.WEST, panelWest);

        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.lightGray);
        frame.getContentPane().add(BorderLayout.CENTER, panelCenter);

        String[] listEntries = {"alpha", "beta", "gamma", "gelta", "epsilon", "zeta", "eta", "theta"};
        list = new JList(listEntries);
        JScrollPane scrollerList = new JScrollPane(list);
        scrollerList.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollerList.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //ограничиваем выбор до одной строки
        list.addListSelectionListener(new ListListener());
        panelWest.add(scrollerList);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    class ListListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting()) {
                String selection = (String) list.getSelectedValue();
                System.out.println(selection);
            }
        }
    }

    class InputTextListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(field.getText());
        }
    }

    class AddText implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.append("Text added\n");
        }
    }

    class AddInputText implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text.append(field.getText() + "\n");
        }
    }

    class ItemListen implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            String onOrOff = "off";
            if (check.isSelected()) onOrOff = "on";
            System.out.println("check box is " + onOrOff);
        }
    }
}
