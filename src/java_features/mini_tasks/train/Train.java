package java_features.mini_tasks.train;

import java.util.ArrayList;

public class Train {
    static interface Move {
        public void move();
    }

    public static class Car implements Move {

        @Override
        public void move() {
            System.out.println("MoveCar");
        }
    }

    public static class Cow implements Move {

        @Override
        public void move() {
            System.out.println("MoveCow");
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Car());
        list.add(new Cow());

        for (Object o : list) {
            if (o instanceof Move) {
                Move m = (Move) o;
                m.move();
            }
        }
    }
}
