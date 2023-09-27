package FinalProject;

import java.util.Scanner;

public class Battleship {
    static Scanner scanner = new Scanner(System.in);
    static String[][] battlefield1 = new String[10][10];
    static String[][] battlefield2 = new String[10][10];

    public static void main(String[] args) {
        System.out.print("Введите имя первого игрока: ");

        Player player1 = new Player(scanner.nextLine());

        System.out.println("Начнем расставлять корабли на поле " + player1.getName() + ". Другой игрок, не смотри!");

        Ships.placeShips(battlefield1);

        System.out.print("Введите имя второго игрока: ");

        Player player2 = new Player(scanner.nextLine());

        System.out.println("Начнем расставлять корабли на поле " + player2.getName() + ". Другой игрок, не смотри!");

        Ships.placeShips(battlefield2);

        // TODO Attack and end of the game
        System.out.println("Our battlefields");
        GameField.printFilled(battlefield1);
        GameField.printFilled(battlefield2);
    }
}
