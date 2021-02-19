package project_7_calculatorFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private static Figure figure = null;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Калькулятор площади и периметра встроеннхы геометрических фигур");

        boolean isNotEnd = true;

        while (isNotEnd) {
            System.out.println("Выбирете действие и введите его номер (Например введите 1 для создания фигуры):");
            System.out.println("1 - Новвая фигруа");
            System.out.println("2 - Вычислить площадь");
            System.out.println("3 - Вычислить периметр");
            String choice = reader.readLine();
            switch (choice) {
                case "1":
                    System.out.println("Какую фигуру вы хотите создать?");
                    System.out.println("1 - Прямоугольник");
                    System.out.println("2 - Круг");
                    System.out.println("3 - Треугольник");
                    String choice2 = reader.readLine();
                    takeFigure(choice2);
                    break;
                case "2":
                    System.out.println("Площадь вашей фигуры равна: " + figure.getSquare());
                    isNotEnd = false;
                    break;
                case "3":
                    System.out.println("Периметр вашей фигуры равен: " + figure.getPerimetеr());
                    isNotEnd = false;
                    break;
                default:
                    System.out.println("Неккоректный ввод. Введите \"1\", \"2\" или \"3\"");
                    break;
            }
        }

    }

    public static void takeFigure(String choice2) throws IOException {
        switch (choice2) {
            case "1":
                System.out.println("Введите стороны AB BC CD DA, нажимая enter после ввода стороны:");
                int AB = Integer.parseInt(reader.readLine());
                int BC = Integer.parseInt(reader.readLine());
                int CD = Integer.parseInt(reader.readLine());
                int DA = Integer.parseInt(reader.readLine());
                figure = new Rectangle(AB, BC, CD, DA);
                break;
            case "2":
                System.out.println("Введите радиус:");
                int radius = Integer.parseInt(reader.readLine());
                figure = new Circle(radius);
                break;
            case "3":
                System.out.println("Введите стороны AB BC CD, нажимая enter после ввода стороны:");
                int ab = Integer.parseInt(reader.readLine());
                int bc = Integer.parseInt(reader.readLine());
                int cd = Integer.parseInt(reader.readLine());
                figure = new Triangular(ab, bc, cd);
                break;
            default:
                System.out.println("Неккоректный ввод. Введите \"1\", \"2\" или \"3\"");
                break;
        }
    }


}
