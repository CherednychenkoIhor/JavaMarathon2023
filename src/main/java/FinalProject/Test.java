package FinalProject;

public class Test {
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