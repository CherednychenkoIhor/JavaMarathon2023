package FinalProject;

public class GameField {
//    static String[][] gameField = new String[10][10];
    static String[] vertical = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void printFilled(String[][] gameField) {
        System.out.println("  0   1  2  3  4   5  6   7  8  9");
        for (int i = 0; i < gameField.length; i++) {
            System.out.print(vertical[i]);
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void filledField(String[][] gameField) {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = " ⬜";
            }
        }
    }
}
