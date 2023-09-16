package FinalProject;

public class GameField {
    private static final int X = 10; // X =
    private static final int Y = 10; // Y =

    static String[][] gameField = new String[X][Y];
//    static String[] republic = {"", "", "  A", "  B", " C", " D", "  E", " F", " G", "  H", " I", " J"};
//    static String[] numbers = {"", "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static void printFilled() {
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
                gameField[i][j] = " ⬜";
            }
//            gameField[0][i] = "";
//            gameField[i][0] = "";
//            gameField[1][i] = republic[i];
//            gameField[i][1] = numbers[i];
//            gameField[11][2] = "⬜";
        }
    }

//    public static void filledOreal(int x, int y) {
//        if (x == 0 && y != 0) {
//            gameField[x][y + 1] = "\uD83D\uDFE6";
//            gameField[x][y - 1] = "\uD83D\uDFE6";
//            gameField[x + 1][y] = "\uD83D\uDFE6";
//            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
//            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
//        } else if (x == 0 && y == 0) {
//            gameField[x][y + 1] = "\uD83D\uDFE6";
//            gameField[x + 1][y] = "\uD83D\uDFE6";
//            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
//        } else if (x != 0 && y == 0) {
//            gameField[x][y + 1] = "\uD83D\uDFE6";
//            gameField[x + 1][y] = "\uD83D\uDFE6";
//            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
//            gameField[x - 1][y] = "\uD83D\uDFE6";
//            gameField[x - 1][y + 1] = "\uD83D\uDFE6";
//        } else {
//            gameField[x][y + 1] = "\uD83D\uDFE6";
//            gameField[x][y - 1] = "\uD83D\uDFE6";
//            gameField[x + 1][y] = "\uD83D\uDFE6";
//            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
//            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
//            gameField[x - 1][y] = "\uD83D\uDFE6";
//            gameField[x - 1][y + 1] = "\uD83D\uDFE6";
//            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
//        }
//    }
}
