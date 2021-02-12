package project_1_game_guess;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GuessGame {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Player p1;
    Player p2;
    Player p3;

    public void menu() throws IOException, InterruptedException {
        System.out.println("Игра \"Угадай число\".\n");
        System.out.println("Правила игры: \n" +
                "- Количестко игроков - 3\n" +
                "- Необходимо угдать число из диапазона [1-8]\n" +
                "\nМеню игры: \n" +
                "1 - Старт\n" +
                "2 - Настройки (Еще не готовы)");
        String choice1 = reader.readLine();
        if (choice1.equals("1")) {
            startGame();
        }
    }

    public void startGame() throws IOException, InterruptedException {
        System.out.println("Введите имя персонажа: ");
        p1 = new Player(reader.readLine());
        p2 = new Player("Sam"); //TODO Сделать рандомные имена с помощью перечислений
        p3 = new Player("Bill");

        System.out.println("Игра началась!");
        System.out.println("Игроки: " + p3.getName() + ", " + p2.getName() + ", " + p1.getName() + ".");
        System.out.println();
        Thread.sleep(1300);

        while (true) {
            System.out.println("Ходит: " + p3.getName() + "...");
            Thread.sleep(2000);
            int p33 = (int) (Math.random() * 9);
            if (p3.guess(p33)) {
                System.out.println("Игрок " + p3.getName() + " угадывает число!");
                break;
            } else System.out.println("Игрок " + p3.getName() + " не угадывает число.");
            System.out.println();
            Thread.sleep(400);

            System.out.println("Ходит: " + p2.getName() + "...");
            Thread.sleep(2000);
            int p22 = (int) (Math.random() * 9);
            if (p2.guess(p22)) {
                System.out.println("Игрок " + p2.getName() + " угадывает число!");
                break;
            } else System.out.println("Игрок " + p2.getName() + " не угадывает число.");
            Thread.sleep(400);
            System.out.println();

            System.out.println("Ходит: " + p1.getName() + "...");
            int p11 = -1;
            while (true) {
                System.out.println("Введите число");
                p11 = Integer.parseInt(reader.readLine());
                if (p11 < 0 | p11 > 8)
                    System.out.println("Вы ввели число не из диапазона [0-8], повторите попытку.");
                else break;
            }
            Thread.sleep(500);
            if (p1.guess(p11)) {
                System.out.println("Игрок " + p1.getName() + " угадывает число!");
                break;
            } else System.out.println("Игрок " + p1.getName() + " не угадывает число.");
            Thread.sleep(1000);
        }
    }
}
