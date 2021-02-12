package project_1_game_guess;

import java.lang.Math;

public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
        number = (int) (Math.random() * 9);
    }

    public boolean guess(int guessedNumber) {
        if (guessedNumber == number) return true;
        else return false;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
