package project_4_musicBox;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MusicDraw {
    JFrame frame;
    MyDrawPanel panel;
    int x = 20, y = 20;
    int width = 70, height = 70;

    public static void main(String[] args) {
        MusicDraw gui = new MusicDraw();
        gui.go();
    }

    public void go() {
        frame = new JFrame("Sound App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 420);
        JButton button = new JButton("Random sound");
        button.addActionListener(new MusicListener());
        panel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }


    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            int[] eventsIWant = {127};
            player.addControllerEventListener(panel, eventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

//             int instrument = (int) (Math.random() * 127);
//            track.add(makeEvent(192, 1, instrument, 0, 1)); //случайный инсрумент (некоторые не звучат из-за
//            System.out.println(instrument + " инструмент"); //длительности нот)

//            for (int i = 5; i < 61; i++) {                  //этот цикл проигрывает все ноты инструмента
//                track.add(makeEvent(144, 1, i, 100, i));
//                track.add(makeEvent(176, 1, 127, 0, i)); //создает события для controlChange
//                track.add(makeEvent(128, 1, i, 100, i+2));
//            }

            int r;
            for (int i = 5; i < 61; i += 4) {
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144, 1, r, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i)); //создает события для controlChange
                track.add(makeEvent(128, 1, r, 100, i + 2));
            }

            player.setSequence(seq);
            player.setTempoInBPM(220);
            player.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int cmd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage(cmd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception ignored) {
        }

        return event;
    }

    public class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false; //флаг, устанавилваем true, когда получаем события

        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            if (msg) {
                //g.fillRect(0, 0, this.getWidth(), this.getHeight());

                g.setColor(randomColor());
                randomXYWH();
                g.fillRect(x, y, width, height);
                msg = false;
            }
        }
    }

    public class MusicListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            play();
        }
    }

    static public Color randomColor() {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        return new Color(red, green, blue);
    }

    public void randomXYWH() {
        x = 20 + (int) (Math.random() * 250);
        y = 40 + (int) (Math.random() * 250);
//        width = 20 + (int) (Math.random() * 150);
//        height = 20 + (int) (Math.random() * 150);
        //x = (int) ((Math.random() * 120) + 10);
        //y = (int) ((Math.random() * 120) + 10);
        width = (int) ((Math.random() * 40) + 10);
        height = (int) ((Math.random() * 40) + 10);
    }
}
