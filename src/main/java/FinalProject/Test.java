package FinalProject;

public class Test {

    public static void getOrealThirdDeck(String[][] gameField) {
        if (gameField[0][0].equals("\uD83D\uDEE5") && gameField[0][1].equals("\uD83D\uDEE5")
                && gameField[0][2].equals("\uD83D\uDEE5")) {
            gameField[1][0] = "\uD83D\uDFE6";
            gameField[1][1] = "\uD83D\uDFE6";
            gameField[1][2] = "\uD83D\uDFE6";
            gameField[1][3] = "\uD83D\uDFE6";
            gameField[0][3] = "\uD83D\uDFE6";
        } else if (gameField[0][0].equals("\uD83D\uDEE5") && gameField[1][0].equals("\uD83D\uDEE5")
                && gameField[2][0].equals("\uD83D\uDEE5")) {
            gameField[0][1] = "\uD83D\uDFE6";
            gameField[1][1] = "\uD83D\uDFE6";
            gameField[2][1] = "\uD83D\uDFE6";
            gameField[3][1] = "\uD83D\uDFE6";
            gameField[3][0] = "\uD83D\uDFE6";
        }

        for (int i = 1; i < gameField.length; i++) {
            for (int j = 1; j < gameField.length; j++) {
                if (gameField[0][9].equals("\uD83D\uDEE5") && gameField[1][9].equals("\uD83D\uDEE5")
                        && gameField[2][9].equals("\uD83D\uDEE5")) {
                    gameField[0][8] = "\uD83D\uDFE6";
                    gameField[1][8] = "\uD83D\uDFE6";
                    gameField[2][8] = "\uD83D\uDFE6";
                    gameField[3][9] = "\uD83D\uDFE6";
                    gameField[3][8] = "\uD83D\uDFE6";
                } else if (gameField[0][9].equals("\uD83D\uDEE5") && gameField[0][8].equals("\uD83D\uDEE5")
                        && gameField[0][7].equals("\uD83D\uDEE5")) {
                    gameField[0][6] = "\uD83D\uDFE6";
                    gameField[1][6] = "\uD83D\uDFE6";
                    gameField[1][7] = "\uD83D\uDFE6";
                    gameField[1][8] = "\uD83D\uDFE6";
                    gameField[1][9] = "\uD83D\uDFE6";
                } else if (gameField[9][0].equals("\uD83D\uDEE5") && gameField[8][0].equals("\uD83D\uDEE5")
                        && gameField[7][0].equals("\uD83D\uDEE5")) {
                    gameField[9][1] = "\uD83D\uDFE6";
                    gameField[8][1] = "\uD83D\uDFE6";
                    gameField[7][1] = "\uD83D\uDFE6";
                    gameField[6][0] = "\uD83D\uDFE6";
                    gameField[6][1] = "\uD83D\uDFE6";
                } else if (gameField[9][0].equals("\uD83D\uDEE5") && gameField[9][1].equals("\uD83D\uDEE5")
                        && gameField[9][2].equals("\uD83D\uDEE5")) {
                    gameField[9][3] = "\uD83D\uDFE6";
                    gameField[8][3] = "\uD83D\uDFE6";
                    gameField[8][1] = "\uD83D\uDFE6";
                    gameField[8][2] = "\uD83D\uDFE6";
                    gameField[8][0] = "\uD83D\uDFE6";
                } else if (gameField[9][9].equals("\uD83D\uDEE5") && gameField[9][8].equals("\uD83D\uDEE5")
                        && gameField[9][7].equals("\uD83D\uDEE5")) {
                    gameField[9][6] = "\uD83D\uDFE6";
                    gameField[8][8] = "\uD83D\uDFE6";
                    gameField[8][7] = "\uD83D\uDFE6";
                    gameField[8][6] = "\uD83D\uDFE6";
                    gameField[8][9] = "\uD83D\uDFE6";
                } else if (gameField[9][9].equals("\uD83D\uDEE5") && gameField[8][9].equals("\uD83D\uDEE5")
                        && gameField[7][9].equals("\uD83D\uDEE5")) {
                    gameField[6][9] = "\uD83D\uDFE6";
                    gameField[8][8] = "\uD83D\uDFE6";
                    gameField[7][8] = "\uD83D\uDFE6";
                    gameField[9][8] = "\uD83D\uDFE6";
                    gameField[6][8] = "\uD83D\uDFE6";
                } else if (gameField[0][j].equals("\uD83D\uDEE5") && gameField[0][j + 1].equals("\uD83D\uDEE5")
                        && gameField[0][j + 2].equals("\uD83D\uDEE5") && j < 9) {
                    gameField[0][j + 3] = "\uD83D\uDFE6";
                    gameField[0][j - 1] = "\uD83D\uDFE6";
                    gameField[1][j] = "\uD83D\uDFE6";
                    gameField[1][j - 1] = "\uD83D\uDFE6";
                    gameField[1][j + 1] = "\uD83D\uDFE6";
                    gameField[1][j + 2] = "\uD83D\uDFE6";
                    gameField[1][j + 3] = "\uD83D\uDFE6";
                } else if (gameField[i][j].equals("\uD83D\uDEE5") && gameField[i][j + 1].equals("\uD83D\uDEE5")
                        && gameField[i][j + 2].equals("\uD83D\uDEE5") && i < 9 && j != 9) {
                    gameField[i][j + 3] = "\uD83D\uDFE6";
                    gameField[i][j - 1] = "\uD83D\uDFE6";
                    gameField[i - 1][j] = "\uD83D\uDFE6";
                    gameField[i - 1][j - 1] = "\uD83D\uDFE6";
                    gameField[i - 1][j + 1] = "\uD83D\uDFE6";
                    gameField[i - 1][j + 2] = "\uD83D\uDFE6";
                    gameField[i - 1][j + 3] = "\uD83D\uDFE6";
                    gameField[i + 1][j] = "\uD83D\uDFE6";
                    gameField[i + 1][j - 1] = "\uD83D\uDFE6";
                    gameField[i + 1][j + 1] = "\uD83D\uDFE6";
                    gameField[i + 1][j + 2] = "\uD83D\uDFE6";
                    gameField[i + 1][j + 3] = "\uD83D\uDFE6";
                    break;
                } else if (gameField[i][9].equals("\uD83D\uDEE5") && i < 9) {
                    gameField[i][8] = "\uD83D\uDFE6";
                    gameField[i + 1][8] = "\uD83D\uDFE6";
                    gameField[i + 2][8] = "\uD83D\uDFE6";
                    gameField[i + 3][8] = "\uD83D\uDFE6";
                    gameField[i + 3][9] = "\uD83D\uDFE6";
                    gameField[i - 1][8] = "\uD83D\uDFE6";
                    gameField[i - 1][9] = "\uD83D\uDFE6";
                    return;
                } else if (gameField[9][j].equals("\uD83D\uDEE5") && gameField[9][j + 1].equals("\uD83D\uDEE5")
                        && gameField[9][j + 2].equals("\uD83D\uDEE5") && i == 9 && j < 9) {
                    gameField[9][j + 3] = "\uD83D\uDFE6";
                    gameField[9][j - 1] = "\uD83D\uDFE6";
                    gameField[8][j] = "\uD83D\uDFE6";
                    gameField[8][j - 1] = "\uD83D\uDFE6";
                    gameField[8][j + 1] = "\uD83D\uDFE6";
                    gameField[8][j + 2] = "\uD83D\uDFE6";
                    gameField[8][j + 3] = "\uD83D\uDFE6";
                    break;
                } else if (gameField[i][j].equals("\uD83D\uDEE5") && gameField[i - 1][j].equals("\uD83D\uDEE5")
                        && gameField[i - 2][j].equals("\uD83D\uDEE5") && i > 2 && i < 9 && j < 9) {
                    gameField[i][j + 1] = "\uD83D\uDFE6";
                    gameField[i][j - 1] = "\uD83D\uDFE6";
                    gameField[i - 3][j] = "\uD83D\uDFE6";
                    gameField[i - 3][j - 1] = "\uD83D\uDFE6";
                    gameField[i - 3][j + 1] = "\uD83D\uDFE6";
                    gameField[i - 2][j - 1] = "\uD83D\uDFE6";
                    gameField[i - 2][j + 1] = "\uD83D\uDFE6";
                    gameField[i + 1][j] = "\uD83D\uDFE6";
                    gameField[i + 1][j + 1] = "\uD83D\uDFE6";
                    gameField[i + 1][j - 1] = "\uD83D\uDFE6";
                    gameField[i - 1][j - 1] = "\uD83D\uDFE6";
                    gameField[i - 1][j + 1] = "\uD83D\uDFE6";
                } else if (gameField[i][0].equals("\uD83D\uDEE5") && gameField[i + 1][0].equals("\uD83D\uDEE5")
                        && gameField[i + 2][0].equals("\uD83D\uDEE5") && i < 9) {
                    gameField[i][1] = "\uD83D\uDFE6";
                    gameField[i + 3][0] = "\uD83D\uDFE6";
                    gameField[i + 1][1] = "\uD83D\uDFE6";
                    gameField[i + 2][1] = "\uD83D\uDFE6";
                    gameField[i + 3][1] = "\uD83D\uDFE6";
                    gameField[i - 1][0] = "\uD83D\uDFE6";
                    gameField[i - 1][1] = "\uD83D\uDFE6";
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
//                        if (x == 0 && y == 0) {
//                            gameField[x][y + 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y] = "\uD83D\uDFE6";
//                        }
//
//                        if (x == 0 && y == 9) {
//                            gameField[x][y - 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y] = "\uD83D\uDFE6";
//                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
//                        }
//
//                        if (x == 9 && y == 9) {
//                            gameField[x][y - 1] = "\uD83D\uDFE6";
//                            gameField[x - 1][y] = "\uD83D\uDFE6";
//                            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
//                        }
//
//                        if (x == 0 && y == 9) {
//                            gameField[x][y - 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y] = "\uD83D\uDFE6";
//                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
//                        }
//
//                        if (x == 0 && (y != 0 && y < 9)) {
//                            gameField[x][y + 1] = "\uD83D\uDFE6";
//                            gameField[x][y - 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y] = "\uD83D\uDFE6";
//                            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
//                        }
//
//                        if (x == 9 && (y != 0 && y < 9)) {
//                            gameField[x][y + 1] = "\uD83D\uDFE6";
//                            gameField[x][y - 1] = "\uD83D\uDFE6";
//                            gameField[x - 1][y] = "\uD83D\uDFE6";
//                            gameField[x - 1][y + 1] = "\uD83D\uDFE6";
//                            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
//                        }
//
//                        if (y == 0 && (x != 0 && x < 9)) {
//                            gameField[x][y + 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y] = "\uD83D\uDFE6";
//                            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
//                            gameField[x - 1][y] = "\uD83D\uDFE6";
//                            gameField[x - 1][y + 1] = "\uD83D\uDFE6";
//                        }
//
//                        if (y == 9 && (x != 0 && x < 9)) {
//                            gameField[x][y - 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y] = "\uD83D\uDFE6";
//                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
//                            gameField[x - 1][y] = "\uD83D\uDFE6";
//                            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
//                        }
//
//                        if (((x != 0 && x < 9) && y != 0) || (x != 0 && (y != 0 && y < 9))) {
//                            gameField[x][y + 1] = "\uD83D\uDFE6";
//                            gameField[x][y - 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y] = "\uD83D\uDFE6";
//                            gameField[x + 1][y + 1] = "\uD83D\uDFE6";
//                            gameField[x + 1][y - 1] = "\uD83D\uDFE6";
//                            gameField[x - 1][y] = "\uD83D\uDFE6";
//                            gameField[x - 1][y + 1] = "\uD83D\uDFE6";
//                            gameField[x - 1][y - 1] = "\uD83D\uDFE6";
//                        }

// 1,2 -> 1,3, 2,2, 0,2, 1,1 -- correct

//                if (gameField[check[0]][check[2]].equals("\uD83D\uDEE5") &&
//                        gameField[check[1]][check[3] + 1].equals("\uD83D\uDEE5")) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else if (gameField[i][j].equals("\uD83D\uDEE5") &&
//                        gameField[i + 1][j].equals("\uD83D\uDEE5")) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else if (gameField[0][0].equals("\uD83D\uDEE5") &&
//                        gameField[1][1].equals("\uD83D\uDEE5")) {
//                    throw new ArithmeticException();
//                } else if (gameField[i][j].equals("\uD83D\uDEE5") &&
//                        gameField[i][j - 1].equals("\uD83D\uDEE5")) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else if (gameField[i][j].equals("\uD83D\uDEE5") && i != 0 &&
//                        gameField[i - 1][j].equals("\uD83D\uDEE5")) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else {
//                    System.out.println("err");
//                    printFilled();
//                    throw new ArithmeticException();
//                }

//                for (int i = 0; i < gameField.length; i++) {
//                    for (int j = 0; j < gameField.length; j++) {
//                        if (gameField[i][j].equals("\uD83D\uDEE5") && i == j && i != 0) {
//                            gameField[check[0]][check[2]] = "\uD83D\uDFE6";
//                            gameField[check[1]][check[3]] = "\uD83D\uDFE6";
//                            throw new ArithmeticException();
//                        }
//                    }
//                }

//                for (int i = 0; i < gameField.length; i++) {
//                    for (int j = 0; j < gameField.length; j++) {
//                        if (gameField[i][j].equals("\uD83D\uDEE5") &&
//                                gameField[i][j + 1].equals("\uD83D\uDEE5")) {
//                            gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                            gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                        } else if (gameField[i][j].equals("\uD83D\uDEE5") &&
//                                gameField[i + 1][j].equals("\uD83D\uDEE5")) {
//                            gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                            gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                        } else if (gameField[0][0].equals("\uD83D\uDEE5") &&
//                                gameField[1][1].equals("\uD83D\uDEE5")) {
//                            throw new ArithmeticException();
//                        } else if (gameField[i][j].equals("\uD83D\uDEE5") &&
//                                gameField[i][j - 1].equals("\uD83D\uDEE5")) {
//                            gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                            gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                        } else if (gameField[i][j].equals("\uD83D\uDEE5") && i != 0 &&
//                                gameField[i - 1][j].equals("\uD83D\uDEE5")) {
//                            gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                            gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                        } else {
//                            System.out.println("err");
//                            printFilled();
//                            throw new ArithmeticException();
//                        }
//                    }
//                }
//                getOrealSecondDeck();
//                printFilled();

//                if (check[1] == check[0] - 1 && check[3] == check[2]) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else if (check[1] == check[0] + 1 && check[3] == check[2]) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else if (check[3] == check[2] + 1 && check[0] == check[1]) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else if (check[3] == check[2] - 1 && check[0] == check[1]) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else if (check[3] == check[2] && check[0] + 1 == check[1]) {
//                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
//                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
//                } else {
//                    throw new ArithmeticException();
//                }

//                getOrealDeck(check[0], check[2], check[1], check[3]);