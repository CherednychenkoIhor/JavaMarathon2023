package FinalProject;

public class GameField {
    private static final int x = 11;
    private static final int y = 11;

    static String[][] gameField = new String[x][y];
    static String[] republic = {"", "  Р", "  Е", " С", " П", "  У", " Б", " Л", "  И", "  К", " А"};
    static String[] numbers = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static void main(String[] args) {
        filledField();

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void filledField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = " ▢";
            }
            gameField[0][i] = republic[i];
            gameField[i][0] = numbers[i];
            gameField[10][1] = "▢";
        }
    }
}
