package FinalProject;

import java.util.Scanner;

public class GameField {
    private static final int X = 10; // X =
    private static final int Y = 10; // Y =

    static String[][] gameField = new String[X][Y];
//    static String[] republic = {"", "", "  A", "  B", " C", " D", "  E", " F", " G", "  H", " I", " J"};
//    static String[] numbers = {"", "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static void addShips() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 4) {
            String[] spelling = new String[]{"первого", "второго", "третьего", "четвертого"};
            System.out.println("Введите кординаты " + spelling[counter] + " однопалубного коробля (Формат: x,y)");
            counter++;
            String deckOne = scanner.nextLine();
            String[] decks = deckOne.split(",");

            int x = Integer.parseInt(decks[0]);
            int y = Integer.parseInt(decks[1]);

            try {
                if (gameField[x][y].equals("\uD83D\uDFE6") || gameField[x][y].equals(" \uD83D\uDEE5")) {
                    throw new IllegalArgumentException();
                }
                gameField[x][y] = "\uD83D\uDEE5";
                for (int i = 0; i < gameField.length; i++) {
                    for (int j = 0; j < gameField.length; j++) {
                        if (x == 0 && y == 0) {
                            gameField[x][y + 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y] = "\uD83D\uDFE6";
                        }
                        if (x == 0 && y == 9) {
                            gameField[x][y - 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y] = "\uD83D\uDFE6";
                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                        }
                        if (x == 9 && y == 9) {
                            gameField[x][y - 1] = "\uD83D\uDFE6";
                            gameField[x - 1][y] = "\uD83D\uDFE6";
                            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                        }
                        if (x == 0 && y == 9) {
                            gameField[x][y - 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y] = "\uD83D\uDFE6";
                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                        }
                        if (x == 0 && (y != 0 && y < 9)) {
                            gameField[x][y + 1] = "\uD83D\uDFE6";
                            gameField[x][y - 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y] = "\uD83D\uDFE6";
                            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                        }
                        if (x == 9 && (y != 0 && y < 9)) {
                            gameField[x][y + 1] = "\uD83D\uDFE6";
                            gameField[x][y - 1] = "\uD83D\uDFE6";
                            gameField[x - 1][y] = "\uD83D\uDFE6";
                            gameField[x - 1][y + 1] = "\uD83D\uDFE6";
                            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                        }
                        if (y == 0 && (x != 0 && x < 9)) {
                            gameField[x][y + 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y] = "\uD83D\uDFE6";
                            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                            gameField[x - 1][y] = "\uD83D\uDFE6";
                            gameField[x - 1][y + 1] = "\uD83D\uDFE6";
                        }
                        if (y == 9 && (x != 0 && x < 9)) {
                            gameField[x][y - 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y] = "\uD83D\uDFE6";
                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                            gameField[x - 1][y] = "\uD83D\uDFE6";
                            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                        }
                        if (((x != 0 && x < 9) && y != 0) || (x != 0 && (y != 0 && y < 9))) {
                            gameField[x][y + 1] = "\uD83D\uDFE6";
                            gameField[x][y - 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y] = "\uD83D\uDFE6";
                            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                            gameField[x - 1][y] = "\uD83D\uDFE6";
                            gameField[x - 1][y + 1] = "\uD83D\uDFE6";
                            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                counter--;
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, " +
                        "в которой не может быть других кораблей (ореол корабля)");
            }
        }
        // 0,0 5,5 9,9 4,6
        //TODO 🛥

    }

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
