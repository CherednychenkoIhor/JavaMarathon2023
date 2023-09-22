package FinalProject;

import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        //TODO Создайте двумерный массив, добавьте на него однопалубные корабли, выведите этот массив на экран, и так далее
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Начнем расставлять корабли на поле "+ player1.getName() + ". Другой игрок, не смотри!");

//        GameField.printFilled();
        Ships.addDeckFourth();
//        Ships.addDeckThree();
//        Ships.addDeckTwo();
//        Ships.addDeckOne();
//        System.out.print("Введите имя второго игрока: ");
//        Player player2 = new Player(scanner.nextLine());
//        GameField.printFilled();
    }
}
