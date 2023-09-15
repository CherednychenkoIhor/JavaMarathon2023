package FinalProject;

public class Battleship {
    public static void main(String[] args) {
        //TODO Создайте двумерный массив, добавьте на него однопалубные корабли, выведите этот массив на экран, и так далее
        GameField.filledField();
        GameField.printFilled();
        GameField.addShips();
        GameField.printFilled();
    }
}
