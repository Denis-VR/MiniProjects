package project_1_game_guess;

import java.io.IOException;

public class GameLauncher {
    public static void main(String[] args) throws IOException, InterruptedException {
        GuessGame game = new GuessGame();
        game.menu();
    }
}
