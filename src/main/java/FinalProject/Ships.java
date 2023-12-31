package FinalProject;

import java.util.Scanner;

public class Ships extends GameField {
    public static void placeShips(String[][] battlefield) {
        // example
        // 0,2 6,0 9,4 5,9 for one deck
        // 3,1;3,2 0,0;1,0 2,5;2,6 for two deck
        // 8,0;8,1;8,2  7,4;7,5;7,6 for three deck
        // 9,9;9,8;9,7;9,6 for four deck
        filledField(battlefield);
        printFilled(battlefield);
        addDeckOne(battlefield);
        addDeckTwo(battlefield); // third deck error
        addDeckThree(battlefield);
        addDeckFourth(battlefield);
    }

    public static void addDeckOne(String[][] gameField) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 4) {
            String[] spelling = new String[]{"первого", "второго", "третьего", "четвертого"};
            int x = 0;
            int y = 0;

            System.out.println("Введите кординаты " + spelling[counter] + " однопалубного коробля (Формат: x,y)");

            counter++;

            try {
                String deckOne = scanner.nextLine();
                String[] decks = deckOne.split(",");

                x = Integer.parseInt(decks[0]);
                y = Integer.parseInt(decks[1]);

                if (x > 9 && y > 9) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                if (gameField[x][y].equals("\uD83D\uDFE6") || gameField[x][y].equals("\uD83D\uDEE5")) {
                    throw new IllegalArgumentException();
                }

                gameField[x][y] = "\uD83D\uDEE5";

                if (gameField[0][0].equals("\uD83D\uDEE5")) {
                    gameField[0][1] = "\uD83D\uDFE6";
                    gameField[1][0] = "\uD83D\uDFE6";
                    gameField[1][1] = "\uD83D\uDFE6";
                }
                if (gameField[9][0].equals("\uD83D\uDEE5")) {
                    gameField[9][1] = "\uD83D\uDFE6";
                    gameField[8][1] = "\uD83D\uDFE6";
                    gameField[8][0] = "\uD83D\uDFE6";
                }
                if (gameField[9][9].equals("\uD83D\uDEE5")) {
                    gameField[9][8] = "\uD83D\uDFE6";
                    gameField[8][8] = "\uD83D\uDFE6";
                    gameField[8][9] = "\uD83D\uDFE6";
                }
                if (gameField[0][9].equals("\uD83D\uDEE5")) {
                    gameField[0][8] = "\uD83D\uDFE6";
                    gameField[1][8] = "\uD83D\uDFE6";
                    gameField[1][9] = "\uD83D\uDFE6";
                } else {
                    for (int i = 1; i < gameField.length; i++) {
                        for (int j = 1; j < gameField.length; j++) {
                            if (gameField[0][j].equals("\uD83D\uDEE5") && j != 9) {
                                gameField[0][j + 1] = "\uD83D\uDFE6";
                                gameField[0][j - 1] = "\uD83D\uDFE6";
                                gameField[1][j] = "\uD83D\uDFE6";
                                gameField[1][j + 1] = "\uD83D\uDFE6";
                                gameField[1][j - 1] = "\uD83D\uDFE6";
                            } else if (gameField[i][j].equals("\uD83D\uDEE5") && i < 9 && j < 9) {
                                gameField[i][j + 1] = "\uD83D\uDFE6";
                                gameField[i][j - 1] = "\uD83D\uDFE6";
                                gameField[i + 1][j - 1] = "\uD83D\uDFE6";
                                gameField[i + 1][j] = "\uD83D\uDFE6";
                                gameField[i + 1][j + 1] = "\uD83D\uDFE6";
                                gameField[i - 1][j - 1] = "\uD83D\uDFE6";
                                gameField[i - 1][j] = "\uD83D\uDFE6";
                                gameField[i - 1][j + 1] = "\uD83D\uDFE6";
                            } else if (gameField[i][j].equals("\uD83D\uDEE5") && i == 9 && j < 9) {
                                gameField[i][j + 1] = "\uD83D\uDFE6";
                                gameField[i][j - 1] = "\uD83D\uDFE6";
                                gameField[i - 1][j - 1] = "\uD83D\uDFE6";
                                gameField[i - 1][j] = "\uD83D\uDFE6";
                                gameField[i - 1][j + 1] = "\uD83D\uDFE6";
                            } else if (gameField[i][0].equals("\uD83D\uDEE5") && i < 9) {
                                gameField[i][1] = "\uD83D\uDFE6";
                                gameField[i + 1][0] = "\uD83D\uDFE6";
                                gameField[i + 1][1] = "\uD83D\uDFE6";
                                gameField[i - 1][0] = "\uD83D\uDFE6";
                                gameField[i - 1][1] = "\uD83D\uDFE6";
                            } else if (gameField[i][j].equals("\uD83D\uDEE5") && j == 9 && i < 9) {
                                gameField[i][j - 1] = "\uD83D\uDFE6";
                                gameField[i + 1][j - 1] = "\uD83D\uDFE6";
                                gameField[i + 1][j] = "\uD83D\uDFE6";
                                gameField[i - 1][j - 1] = "\uD83D\uDFE6";
                                gameField[i - 1][j] = "\uD83D\uDFE6";
                            }
                        }
                    }
                }
                printFilled(gameField);

            } catch (NumberFormatException e) {
                gameField[x][y] = " ⬜";
                counter--;
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            } catch (IllegalArgumentException e) {
                counter--;
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, " +
                        "в которой не может быть других кораблей (ореол корабля)");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
                counter--;
            }
        }
    }

    public static void addDeckTwo(String[][] gameField) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 3) {
            String[] spelling = new String[]{"первого", "второго", "третьего"};

            System.out.println("Введите кординаты " + spelling[counter] + " двухпалубного коробля (Формат: x,y;x,y)");

            counter++;

            try {
                String deckOne = scanner.nextLine();
                final String[] decks = deckOne.split(";");
                String[] deckTwo;
                int[] check = new int[6];
                int x, y;

                for (int i = 0; i < decks.length; i++) {
                    deckTwo = decks[i].split(",");
                    x = Integer.parseInt(deckTwo[0]);
                    y = Integer.parseInt(deckTwo[1]);
                    check[i] += x;
                    check[i + 2] += y;
                }

                if (gameField[check[0]][check[2]].equals("\uD83D\uDFE6") || gameField[check[0]][check[2]].equals(" \uD83D\uDEE5") ||
                        gameField[check[1]][check[3]].equals("\uD83D\uDFE6") || gameField[check[1]][check[3]].equals(" \uD83D\uDEE5")) {
                    throw new IllegalArgumentException();
                }

                gameField[check[0]][check[2]] = "\uD83D\uDEE5";
                gameField[check[1]][check[3]] = "\uD83D\uDEE5";

                if (check[0] == 0 && check[2] == 0 && check[1] == 1 && check[3] == 1) {
                    gameField[check[0]][check[2]] = " ⬜";
                    gameField[check[1]][check[3]] = " ⬜";
                    throw new ArithmeticException();
                }
                if (check[0] == 0 && check[2] == 0 && check[1] == 1 && check[3] == 0) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[2] == 9 && check[1] == 8 && check[3] == 9) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[2] == 9 && check[1] == 9 && check[3] == 8) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[2] == 0 && check[1] == 9 && check[3] == 1) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] > 0 && check[2] == 9 && check[1] > 0 && check[3] == 9) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 0 && check[2] == 9 && check[1] == 1 && check[3] == 9) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 0 && check[2] == 9 && check[1] == 0 && check[3] == 8) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[1]][check[3]].equals(gameField[check[0]][check[2] + 1]) && check[2] != 9) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[1]][check[3]].equals(gameField[check[0] - 1][check[2]])) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[1]][check[3]].equals(gameField[check[0] + 1][check[2]]) && check[0] < 9) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[1]][check[3]].equals(gameField[check[0]][check[2] - 1])) {
                    getOrealSecondDeck(gameField);
                    printFilled(gameField);
                } else {
                    gameField[check[0]][check[2]] = " ⬜";
                    gameField[check[1]][check[3]] = " ⬜";
                    throw new ArithmeticException();
                }

            } catch (NumberFormatException e) {
                counter--;
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            } catch (
                    IllegalArgumentException e) {
                counter--;
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, " +
                        "в которой не может быть других кораблей (ореол корабля)");
            } catch (
                    ArithmeticException e) {
                counter--;
                System.out.println("несколько координат, разбросанных по карте - это невалидный корабль.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            }
        }
    }

    public static void addDeckThree(String[][] gameField) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 2) {
            String[] spelling = new String[]{"первого", "второго"};

            System.out.println("Введите кординаты " + spelling[counter] + " трехпалубного коробля (Формат: x,y;x,y;x,y)");

            counter++;

            int[] check = new int[7];

            try {
                String deckOne = scanner.nextLine();
                final String[] decks = deckOne.split(";");
                String[] deckTwo;
                int x, y;

                for (int i = 0; i < decks.length; i++) {
                    deckTwo = decks[i].split(",");
                    x = Integer.parseInt(deckTwo[0]);
                    y = Integer.parseInt(deckTwo[1]);
                    check[i] += x;
                    check[i + 3] += y;
                }

                if (gameField[check[0]][check[3]].equals("\uD83D\uDFE6") || gameField[check[0]][check[3]].equals(" \uD83D\uDEE5") ||
                        gameField[check[1]][check[4]].equals("\uD83D\uDFE6") || gameField[check[1]][check[4]].equals(" \uD83D\uDEE5") ||
                        gameField[check[2]][check[5]].equals("\uD83D\uDFE6") || gameField[check[2]][check[5]].equals(" \uD83D\uDEE5")) {
                    throw new IllegalArgumentException();
                }

                gameField[check[0]][check[3]] = "\uD83D\uDEE5";
                gameField[check[1]][check[4]] = "\uD83D\uDEE5";
                gameField[check[2]][check[5]] = "\uD83D\uDEE5";

                if (check[0] == 0 && check[3] == 0 && check[1] == 1 && check[4] == 1 && check[2] == 2 && check[5] == 2) {
                    gameField[check[0]][check[3]] = " ⬜";
                    gameField[check[1]][check[4]] = " ⬜";
                    gameField[check[2]][check[5]] = " ⬜";
                    throw new ArithmeticException();
                }
                if (check[0] == 0 && check[3] == 0 && check[1] == 1 && check[4] == 0 && check[2] == 2 && check[5] == 0) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[3] == 9 && check[1] == 8 && check[4] == 9 && check[2] == 7
                        && check[5] == 9) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[3] == 9 && check[1] == 9 && check[4] == 8 && check[2] == 9 && check[5] == 7) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[3] == 0 && check[1] == 9 && check[4] == 1 && check[2] == 9 && check[5] == 2) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] > 0 && check[3] == 9 && check[1] > 0 && check[4] == 9 && check[2] > 0 && check[5] == 9) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 0 && check[3] == 9 && check[1] == 1 && check[4] == 9 && check[2] == 2 && check[5] == 9) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 0 && check[3] == 9 && check[1] == 0 && check[4] == 8 && check[2] == 0 && check[5] == 7) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[2]][check[5]].equals(gameField[check[1]][check[4] + 1])
                        && gameField[check[2]][check[5]].equals(gameField[check[0]][check[3] + 2])
                        && check[4] != 9 && check[5] != 9 && check[3] != 9) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[2]][check[5]].equals(gameField[check[1] - 1][check[4]])
                        && gameField[check[2]][check[5]].equals(gameField[check[0] - 2][check[3]])) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[2]][check[5]].equals(gameField[check[1] + 1][check[4]])
                        && gameField[check[2]][check[5]].equals(gameField[check[0] + 2][check[3]])) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[2]][check[5]].equals(gameField[check[1]][check[4] - 1])
                        && gameField[check[2]][check[5]].equals(gameField[check[0]][check[3] - 2])) {
                    getOrealThirdDeck(gameField);
                    printFilled(gameField);
                } else {
                    gameField[check[0]][check[3]] = " ⬜";
                    gameField[check[1]][check[4]] = " ⬜";
                    gameField[check[2]][check[5]] = " ⬜";
                    throw new ArithmeticException();
                }


            } catch (NumberFormatException e) {
                gameField[check[0]][check[3]] = " ⬜";
                gameField[check[1]][check[4]] = " ⬜";
                gameField[check[2]][check[5]] = " ⬜";
                counter--;
                System.out.println("Смотри формат ввода координат! (Формат: x,y;x,y;x,y)");
            } catch (
                    IllegalArgumentException e) {
                counter--;
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, " +
                        "в которой не может быть других кораблей (ореол корабля)");
            } catch (ArithmeticException e) {
                counter--;
                System.out.println("несколько координат, разбросанных по карте - это невалидный корабль.");
            } catch (ArrayIndexOutOfBoundsException e) {
                gameField[check[0]][check[3]] = " ⬜";
                gameField[check[1]][check[4]] = " ⬜";
                gameField[check[2]][check[5]] = " ⬜";
                counter--;
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            }
        }
    }

    public static void addDeckFourth(String[][] gameField) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 1) {

            System.out.println("Введите кординаты четырёхпалубного коробля (Формат: x,y;x,y;x,y;x,y)");

            counter++;

            int[] check = new int[8];

            try {
                String deckOne = scanner.nextLine();
                final String[] decks = deckOne.split(";");
                String[] deckTwo;
                int x, y;

                for (int i = 0; i < decks.length; i++) {
                    deckTwo = decks[i].split(",");
                    x = Integer.parseInt(deckTwo[0]);
                    y = Integer.parseInt(deckTwo[1]);
                    check[i] += x;
                    check[i + 4] += y;
                }

                if (gameField[check[0]][check[4]].equals("\uD83D\uDFE6") || gameField[check[0]][check[4]].equals(" \uD83D\uDEE5") ||
                        gameField[check[1]][check[5]].equals("\uD83D\uDFE6") || gameField[check[1]][check[5]].equals(" \uD83D\uDEE5") ||
                        gameField[check[2]][check[6]].equals("\uD83D\uDFE6") || gameField[check[2]][check[6]].equals(" \uD83D\uDEE5") ||
                        gameField[check[3]][check[7]].equals("\uD83D\uDFE6") || gameField[check[3]][check[7]].equals(" \uD83D\uDEE5")) {
                    throw new IllegalArgumentException();
                }

                gameField[check[0]][check[4]] = "\uD83D\uDEE5";
                gameField[check[1]][check[5]] = "\uD83D\uDEE5";
                gameField[check[2]][check[6]] = "\uD83D\uDEE5";
                gameField[check[3]][check[7]] = "\uD83D\uDEE5";


                if (check[0] == 0 && check[4] == 0 && check[1] == 1 && check[5] == 1 && check[2] == 2 && check[6] == 2
                        && check[3] == 3 && check[7] == 3) {
                    gameField[check[0]][check[4]] = " ⬜";
                    gameField[check[1]][check[5]] = " ⬜";
                    gameField[check[2]][check[6]] = " ⬜";
                    gameField[check[3]][check[7]] = " ⬜";
                    throw new ArithmeticException();
                }
                if (check[0] == 0 && check[4] == 0 && check[1] == 1 && check[5] == 0 && check[2] == 2 && check[6] == 0
                        && check[3] == 3 && check[7] == 0) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[4] == 9 && check[1] == 8 && check[5] == 9 && check[2] == 7
                        && check[6] == 9 && check[3] == 6 && check[7] == 9) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[4] == 9 && check[1] == 9 && check[5] == 8 && check[2] == 9
                        && check[6] == 7 && check[3] == 9 && check[7] == 6) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 9 && check[4] == 0 && check[1] == 9 && check[5] == 1
                        && check[2] == 9 && check[6] == 2 && check[3] == 9 && check[7] == 3) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] > 0 && check[4] == 9 && check[1] > 0 && check[5] == 9
                        && check[2] > 0 && check[6] == 9 && check[3] > 0 && check[7] == 9) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 0 && check[4] == 9 && check[1] == 1 && check[5] == 9
                        && check[2] == 2 && check[6] == 9 && check[3] == 3 && check[7] == 9) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (check[0] == 0 && check[4] == 9 && check[1] == 0 && check[5] == 8
                        && check[2] == 0 && check[6] == 7 && check[3] == 0 && check[7] == 6) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[3]][check[7]].equals(gameField[check[2]][check[6] + 1])
                        && gameField[check[3]][check[7]].equals(gameField[check[1]][check[5] + 2])
                        && gameField[check[3]][check[7]].equals(gameField[check[0]][check[4] + 3])
                        && check[5] != 9 && check[7] != 9 && check[6] != 9 && check[4] != 9) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[3]][check[7]].equals(gameField[check[2] - 1][check[6]])
                        && gameField[check[3]][check[7]].equals(gameField[check[1] - 2][check[5]])
                        && gameField[check[3]][check[7]].equals(gameField[check[0] - 3][check[4]])) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[3]][check[7]].equals(gameField[check[2] + 1][check[6]])
                        && gameField[check[3]][check[7]].equals(gameField[check[1] + 2][check[5]])
                        && gameField[check[3]][check[7]].equals(gameField[check[0] + 3][check[4]])) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else if (gameField[check[3]][check[7]].equals(gameField[check[2]][check[6] - 1])
                        && gameField[check[3]][check[7]].equals(gameField[check[1]][check[5] - 2])
                        && gameField[check[3]][check[7]].equals(gameField[check[0]][check[4] - 3])) {
                    getOrealFourthDeck(gameField);
                    printFilled(gameField);
                } else {
                    gameField[check[0]][check[4]] = " ⬜";
                    gameField[check[1]][check[5]] = " ⬜";
                    gameField[check[2]][check[6]] = " ⬜";
                    gameField[check[3]][check[7]] = " ⬜";
                    throw new ArithmeticException();
                }

            } catch (NumberFormatException e) {
                gameField[check[0]][check[4]] = " ⬜";
                gameField[check[1]][check[5]] = " ⬜";
                gameField[check[2]][check[6]] = " ⬜";
                gameField[check[3]][check[7]] = " ⬜";
                counter--;
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            } catch (
                    IllegalArgumentException e) {
                counter--;
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, " +
                        "в которой не может быть других кораблей (ореол корабля)");
            } catch (ArithmeticException e) {
                counter--;
                System.out.println("несколько координат, разбросанных по карте - это невалидный корабль.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            }
        }
    }

    public static void getOrealSecondDeck(String[][] gameField) {
        if (gameField[0][0].equals("\uD83D\uDEE5") && gameField[0][1].equals("\uD83D\uDEE5")) {
            gameField[0][2] = "\uD83D\uDFE6";
            gameField[1][0] = "\uD83D\uDFE6";
            gameField[1][1] = "\uD83D\uDFE6";
            gameField[1][2] = "\uD83D\uDFE6";
        } else if (gameField[0][0].equals("\uD83D\uDEE5") && gameField[1][0].equals("\uD83D\uDEE5")) {
            gameField[0][1] = "\uD83D\uDFE6";
            gameField[1][1] = "\uD83D\uDFE6";
            gameField[2][0] = "\uD83D\uDFE6";
            gameField[2][1] = "\uD83D\uDFE6";
        } else {
            for (int i = 1; i < gameField.length; i++) {
                for (int j = 1; j < 9; j++) {
                    if (gameField[0][9].equals("\uD83D\uDEE5") && gameField[1][9].equals("\uD83D\uDEE5")) {
                        gameField[0][8] = "\uD83D\uDFE6";
                        gameField[1][8] = "\uD83D\uDFE6";
                        gameField[2][8] = "\uD83D\uDFE6";
                        gameField[2][9] = "\uD83D\uDFE6";
                    } else if (gameField[0][9].equals("\uD83D\uDEE5") && gameField[0][8].equals("\uD83D\uDEE5")) {
                        gameField[0][7] = "\uD83D\uDFE6";
                        gameField[1][7] = "\uD83D\uDFE6";
                        gameField[1][8] = "\uD83D\uDFE6";
                        gameField[1][9] = "\uD83D\uDFE6";
                    } else if (gameField[9][0].equals("\uD83D\uDEE5") && gameField[8][0].equals("\uD83D\uDEE5")) {
                        gameField[9][1] = "\uD83D\uDFE6";
                        gameField[8][1] = "\uD83D\uDFE6";
                        gameField[7][1] = "\uD83D\uDFE6";
                        gameField[7][0] = "\uD83D\uDFE6";
                    } else if (gameField[9][0].equals("\uD83D\uDEE5") && gameField[9][1].equals("\uD83D\uDEE5")) {
                        gameField[9][2] = "\uD83D\uDFE6";
                        gameField[8][1] = "\uD83D\uDFE6";
                        gameField[8][2] = "\uD83D\uDFE6";
                        gameField[8][0] = "\uD83D\uDFE6";
                    } else if (gameField[9][9].equals("\uD83D\uDEE5") && gameField[9][8].equals("\uD83D\uDEE5")) {
                        gameField[9][7] = "\uD83D\uDFE6";
                        gameField[8][8] = "\uD83D\uDFE6";
                        gameField[8][7] = "\uD83D\uDFE6";
                        gameField[8][9] = "\uD83D\uDFE6";
                    } else if (gameField[9][9].equals("\uD83D\uDEE5") && gameField[8][9].equals("\uD83D\uDEE5")) {
                        gameField[7][9] = "\uD83D\uDFE6";
                        gameField[8][8] = "\uD83D\uDFE6";
                        gameField[7][8] = "\uD83D\uDFE6";
                        gameField[9][8] = "\uD83D\uDFE6";
                    } else if (gameField[i][0].equals("\uD83D\uDEE5") && gameField[i][1].equals("\uD83D\uDEE5") && i < 9) {
                        gameField[i - 1][0] = "\uD83D\uDFE6";
                        gameField[i + 1][0] = "\uD83D\uDFE6";
                        gameField[i + 1][1] = "\uD83D\uDFE6";
                        gameField[i - 1][1] = "\uD83D\uDFE6";
                        gameField[i][2] = "\uD83D\uDFE6";
                        gameField[i - 1][2] = "\uD83D\uDFE6";
                        gameField[i + 1][2] = "\uD83D\uDFE6";
                    } else if (gameField[i][j].equals("\uD83D\uDEE5") && gameField[i][j + 1].equals("\uD83D\uDEE5")
                            && i < 9) {
                        gameField[i][j + 2] = "\uD83D\uDFE6";
                        gameField[i][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 1][j] = "\uD83D\uDFE6";
                        gameField[i - 1][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 1][j + 1] = "\uD83D\uDFE6";
                        gameField[i - 1][j + 2] = "\uD83D\uDFE6";
                        gameField[i + 1][j] = "\uD83D\uDFE6";
                        gameField[i + 1][j - 1] = "\uD83D\uDFE6";
                        gameField[i + 1][j + 1] = "\uD83D\uDFE6";
                        gameField[i + 1][j + 2] = "\uD83D\uDFE6";
                        break;
                    } else if (gameField[i][9].equals("\uD83D\uDEE5") && gameField[i + 1][9].equals("\uD83D\uDEE5")
                            && i < 9) {
                        gameField[i][8] = "\uD83D\uDFE6";
                        gameField[i + 1][8] = "\uD83D\uDFE6";
                        gameField[i + 2][8] = "\uD83D\uDFE6";
                        gameField[i + 2][9] = "\uD83D\uDFE6";
                        gameField[i - 1][8] = "\uD83D\uDFE6";
                        gameField[i - 1][9] = "\uD83D\uDFE6";
                        break;
                    } else if (gameField[9][j].equals("\uD83D\uDEE5") && gameField[9][j + 1].equals("\uD83D\uDEE5")) {
                        gameField[9][j + 2] = "\uD83D\uDFE6";
                        gameField[9][j - 1] = "\uD83D\uDFE6";
                        gameField[8][j] = "\uD83D\uDFE6";
                        gameField[8][j - 1] = "\uD83D\uDFE6";
                        gameField[8][j + 1] = "\uD83D\uDFE6";
                        gameField[8][j + 2] = "\uD83D\uDFE6";
                    } else if (gameField[i][j].equals("\uD83D\uDEE5") && gameField[i - 1][j].equals("\uD83D\uDEE5")
                            && i < 9) {
                        gameField[i][j + 1] = "\uD83D\uDFE6";
                        gameField[i][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 2][j] = "\uD83D\uDFE6";
                        gameField[i - 2][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 2][j + 1] = "\uD83D\uDFE6";
                        gameField[i + 1][j] = "\uD83D\uDFE6";
                        gameField[i + 1][j + 1] = "\uD83D\uDFE6";
                        gameField[i + 1][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 1][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 1][j + 1] = "\uD83D\uDFE6";
                    } else if (gameField[i][0].equals("\uD83D\uDEE5") && gameField[i + 1][0].equals("\uD83D\uDEE5") && i < 9) {
                        gameField[i][1] = "\uD83D\uDFE6";
                        gameField[i + 2][0] = "\uD83D\uDFE6";
                        gameField[i + 1][1] = "\uD83D\uDFE6";
                        gameField[i + 2][1] = "\uD83D\uDFE6";
                        gameField[i - 1][0] = "\uD83D\uDFE6";
                        gameField[i - 1][1] = "\uD83D\uDFE6";
                    } else if (gameField[0][j].equals("\uD83D\uDEE5") && gameField[0][j + 1].equals("\uD83D\uDEE5")
                            && j < 8) {
                        gameField[0][j + 2] = "\uD83D\uDFE6";
                        gameField[0][j - 1] = "\uD83D\uDFE6";
                        gameField[1][j] = "\uD83D\uDFE6";
                        gameField[1][j + 1] = "\uD83D\uDFE6";
                        gameField[1][j + 2] = "\uD83D\uDFE6";
                        gameField[1][j - 1] = "\uD83D\uDFE6";
                    }
                }
            }
        }
    }

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
        } else {

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
                    } else if (i < 9 && j < 9) {
                        if (gameField[i][j].equals("\uD83D\uDEE5") && gameField[i][j + 1].equals("\uD83D\uDEE5")
                                && gameField[i][j + 2].equals("\uD83D\uDEE5")) {
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
                        }
                    } else if (gameField[i][9].equals("\uD83D\uDEE5") && gameField[i + 1][9].equals("\uD83D\uDEE5")
                            && gameField[i + 2][9].equals("\uD83D\uDEE5") && i < 9) {
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
                if (gameField[i][0].equals("\uD83D\uDEE5") && gameField[i][1].equals("\uD83D\uDEE5")
                        && gameField[i][2].equals("\uD83D\uDEE5") && i < 9) {
                    gameField[i - 1][0] = "\uD83D\uDFE6";
                    gameField[i + 1][0] = "\uD83D\uDFE6";
                    gameField[i + 1][1] = "\uD83D\uDFE6";
                    gameField[i - 1][1] = "\uD83D\uDFE6";
                    gameField[i - 1][2] = "\uD83D\uDFE6";
                    gameField[i + 1][2] = "\uD83D\uDFE6";
                    gameField[i][3] = "\uD83D\uDFE6";
                    gameField[i - 1][3] = "\uD83D\uDFE6";
                    gameField[i + 1][3] = "\uD83D\uDFE6";
                }
            }
        }
    }

    public static void getOrealFourthDeck(String[][] gameField) {
        if (gameField[0][0].equals("\uD83D\uDEE5") && gameField[0][1].equals("\uD83D\uDEE5")
                && gameField[0][2].equals("\uD83D\uDEE5") && gameField[0][3].equals("\uD83D\uDEE5")) {
            gameField[1][0] = "\uD83D\uDFE6";
            gameField[1][1] = "\uD83D\uDFE6";
            gameField[1][2] = "\uD83D\uDFE6";
            gameField[1][3] = "\uD83D\uDFE6";
            gameField[1][4] = "\uD83D\uDFE6";
            gameField[0][4] = "\uD83D\uDFE6";
        } else if (gameField[0][0].equals("\uD83D\uDEE5") && gameField[1][0].equals("\uD83D\uDEE5")
                && gameField[2][0].equals("\uD83D\uDEE5") && gameField[3][0].equals("\uD83D\uDEE5")) {
            gameField[0][1] = "\uD83D\uDFE6";
            gameField[1][1] = "\uD83D\uDFE6";
            gameField[2][1] = "\uD83D\uDFE6";
            gameField[3][1] = "\uD83D\uDFE6";
            gameField[4][1] = "\uD83D\uDFE6";
            gameField[4][0] = "\uD83D\uDFE6";
        } else {
            for (int i = 1; i < gameField.length; i++) {
                for (int j = 1; j < gameField.length; j++) {
                    if (gameField[0][9].equals("\uD83D\uDEE5") && gameField[1][9].equals("\uD83D\uDEE5")
                            && gameField[2][9].equals("\uD83D\uDEE5") && gameField[3][9].equals("\uD83D\uDEE5")) {
                        gameField[0][8] = "\uD83D\uDFE6";
                        gameField[1][8] = "\uD83D\uDFE6";
                        gameField[2][8] = "\uD83D\uDFE6";
                        gameField[3][8] = "\uD83D\uDFE6";
                        gameField[4][8] = "\uD83D\uDFE6";
                        gameField[4][9] = "\uD83D\uDFE6";
                    } else if (gameField[0][9].equals("\uD83D\uDEE5") && gameField[0][8].equals("\uD83D\uDEE5")
                            && gameField[0][7].equals("\uD83D\uDEE5") && gameField[0][6].equals("\uD83D\uDEE5")) {
                        gameField[0][5] = "\uD83D\uDFE6";
                        gameField[1][5] = "\uD83D\uDFE6";
                        gameField[1][6] = "\uD83D\uDFE6";
                        gameField[1][7] = "\uD83D\uDFE6";
                        gameField[1][8] = "\uD83D\uDFE6";
                        gameField[1][9] = "\uD83D\uDFE6";
                    } else if (gameField[9][0].equals("\uD83D\uDEE5") && gameField[8][0].equals("\uD83D\uDEE5")
                            && gameField[7][0].equals("\uD83D\uDEE5") && gameField[6][0].equals("\uD83D\uDEE5")) {
                        gameField[9][1] = "\uD83D\uDFE6";
                        gameField[8][1] = "\uD83D\uDFE6";
                        gameField[7][1] = "\uD83D\uDFE6";
                        gameField[6][1] = "\uD83D\uDFE6";
                        gameField[5][1] = "\uD83D\uDFE6";
                        gameField[5][0] = "\uD83D\uDFE6";
                    } else if (gameField[9][0].equals("\uD83D\uDEE5") && gameField[9][1].equals("\uD83D\uDEE5")
                            && gameField[9][2].equals("\uD83D\uDEE5") && gameField[9][3].equals("\uD83D\uDEE5")) {
                        gameField[9][4] = "\uD83D\uDFE6";
                        gameField[8][4] = "\uD83D\uDFE6";
                        gameField[8][3] = "\uD83D\uDFE6";
                        gameField[8][1] = "\uD83D\uDFE6";
                        gameField[8][2] = "\uD83D\uDFE6";
                        gameField[8][0] = "\uD83D\uDFE6";
                    } else if (gameField[9][9].equals("\uD83D\uDEE5") && gameField[9][8].equals("\uD83D\uDEE5")
                            && gameField[9][7].equals("\uD83D\uDEE5") && gameField[9][6].equals("\uD83D\uDEE5")) {
                        gameField[9][5] = "\uD83D\uDFE6";
                        gameField[8][9] = "\uD83D\uDFE6";
                        gameField[8][8] = "\uD83D\uDFE6";
                        gameField[8][7] = "\uD83D\uDFE6";
                        gameField[8][6] = "\uD83D\uDFE6";
                        gameField[8][5] = "\uD83D\uDFE6";
                    } else if (gameField[9][9].equals("\uD83D\uDEE5") && gameField[8][9].equals("\uD83D\uDEE5")
                            && gameField[7][9].equals("\uD83D\uDEE5") && gameField[6][9].equals("\uD83D\uDEE5")) {
                        gameField[5][9] = "\uD83D\uDFE6";
                        gameField[8][8] = "\uD83D\uDFE6";
                        gameField[7][8] = "\uD83D\uDFE6";
                        gameField[9][8] = "\uD83D\uDFE6";
                        gameField[6][8] = "\uD83D\uDFE6";
                        gameField[5][8] = "\uD83D\uDFE6";
                    } else if (gameField[i][9].equals("\uD83D\uDEE5") && gameField[i + 1][9].equals("\uD83D\uDEE5")
                            && gameField[i + 2][9].equals("\uD83D\uDEE5") && gameField[i + 3][9].equals("\uD83D\uDEE5")
                            && i < 9) {
                        gameField[i][8] = "\uD83D\uDFE6";
                        gameField[i + 1][8] = "\uD83D\uDFE6";
                        gameField[i + 2][8] = "\uD83D\uDFE6";
                        gameField[i + 3][8] = "\uD83D\uDFE6";
                        gameField[i + 4][8] = "\uD83D\uDFE6";
                        gameField[i + 4][9] = "\uD83D\uDFE6";
                        gameField[i - 1][8] = "\uD83D\uDFE6";
                        gameField[i - 1][9] = "\uD83D\uDFE6";
                        return;
                    } else if (gameField[0][j].equals("\uD83D\uDEE5") && gameField[0][j + 1].equals("\uD83D\uDEE5")
                            && gameField[0][j + 2].equals("\uD83D\uDEE5") && gameField[0][j + 3].equals("\uD83D\uDEE5")
                            && j < 9) {
                        gameField[0][j + 4] = "\uD83D\uDFE6";
                        gameField[0][j - 1] = "\uD83D\uDFE6";
                        gameField[1][j] = "\uD83D\uDFE6";
                        gameField[1][j - 1] = "\uD83D\uDFE6";
                        gameField[1][j + 1] = "\uD83D\uDFE6";
                        gameField[1][j + 2] = "\uD83D\uDFE6";
                        gameField[1][j + 3] = "\uD83D\uDFE6";
                        gameField[1][j + 4] = "\uD83D\uDFE6";
                    } else if (gameField[i][j].equals("\uD83D\uDEE5") && gameField[i][j + 1].equals("\uD83D\uDEE5")
                            && gameField[i][j + 2].equals("\uD83D\uDEE5") && gameField[i][j + 3].equals("\uD83D\uDEE5")
                            && i < 9 && j != 9) {
                        gameField[i][j + 4] = "\uD83D\uDFE6";
                        gameField[i][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 1][j] = "\uD83D\uDFE6";
                        gameField[i - 1][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 1][j + 1] = "\uD83D\uDFE6";
                        gameField[i - 1][j + 2] = "\uD83D\uDFE6";
                        gameField[i - 1][j + 3] = "\uD83D\uDFE6";
                        gameField[i - 1][j + 4] = "\uD83D\uDFE6";
                        gameField[i + 1][j] = "\uD83D\uDFE6";
                        gameField[i + 1][j - 1] = "\uD83D\uDFE6";
                        gameField[i + 1][j + 1] = "\uD83D\uDFE6";
                        gameField[i + 1][j + 2] = "\uD83D\uDFE6";
                        gameField[i + 1][j + 3] = "\uD83D\uDFE6";
                        gameField[i + 1][j + 4] = "\uD83D\uDFE6";
                        break;
                    } else if (gameField[9][j].equals("\uD83D\uDEE5") && gameField[9][j + 1].equals("\uD83D\uDEE5")
                            && gameField[9][j + 2].equals("\uD83D\uDEE5") && gameField[9][j + 3].equals("\uD83D\uDEE5")
                            && i == 9 && j < 9) {
                        gameField[9][j + 4] = "\uD83D\uDFE6";
                        gameField[9][j - 1] = "\uD83D\uDFE6";
                        gameField[8][j] = "\uD83D\uDFE6";
                        gameField[8][j - 1] = "\uD83D\uDFE6";
                        gameField[8][j + 1] = "\uD83D\uDFE6";
                        gameField[8][j + 2] = "\uD83D\uDFE6";
                        gameField[8][j + 3] = "\uD83D\uDFE6";
                        gameField[8][j + 4] = "\uD83D\uDFE6";
                        break;
                    } else if (gameField[i][j].equals("\uD83D\uDEE5") && gameField[i - 1][j].equals("\uD83D\uDEE5")
                            && gameField[i - 2][j].equals("\uD83D\uDEE5") && gameField[i - 3][j].equals("\uD83D\uDEE5")
                            && i > 3 && i < 9 && j < 9) {
                        gameField[i][j + 1] = "\uD83D\uDFE6";
                        gameField[i][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 4][j] = "\uD83D\uDFE6";
                        gameField[i - 4][j - 1] = "\uD83D\uDFE6";
                        gameField[i - 4][j + 1] = "\uD83D\uDFE6";
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
                            && gameField[i + 2][0].equals("\uD83D\uDEE5") && gameField[i + 3][0].equals("\uD83D\uDEE5")
                            && i < 9) {
                        gameField[i][1] = "\uD83D\uDFE6";
                        gameField[i + 4][0] = "\uD83D\uDFE6";
                        gameField[i + 1][1] = "\uD83D\uDFE6";
                        gameField[i + 2][1] = "\uD83D\uDFE6";
                        gameField[i + 3][1] = "\uD83D\uDFE6";
                        gameField[i + 4][1] = "\uD83D\uDFE6";
                        gameField[i - 1][0] = "\uD83D\uDFE6";
                        gameField[i - 1][1] = "\uD83D\uDFE6";
                    } else if (gameField[i][0].equals("\uD83D\uDEE5") && gameField[i][1].equals("\uD83D\uDEE5")
                            && gameField[i][2].equals("\uD83D\uDEE5") && gameField[i][3].equals("\uD83D\uDEE5") && i < 9) {
                        gameField[i - 1][0] = "\uD83D\uDFE6";
                        gameField[i + 1][0] = "\uD83D\uDFE6";
                        gameField[i + 1][1] = "\uD83D\uDFE6";
                        gameField[i - 1][1] = "\uD83D\uDFE6";
                        gameField[i - 1][2] = "\uD83D\uDFE6";
                        gameField[i + 1][2] = "\uD83D\uDFE6";
                        gameField[i - 1][3] = "\uD83D\uDFE6";
                        gameField[i + 1][3] = "\uD83D\uDFE6";
                        gameField[i][4] = "\uD83D\uDFE6";
                        gameField[i - 1][4] = "\uD83D\uDFE6";
                        gameField[i + 1][4] = "\uD83D\uDFE6";

                    }
                }
            }
        }
    }
}
