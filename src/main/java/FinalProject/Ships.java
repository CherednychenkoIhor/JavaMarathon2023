package FinalProject;

import java.util.Scanner;

public class Ships extends GameField {
    private final int x;
    private final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Ships(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void addDeckOne() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 4) {
            String[] spelling = new String[]{"первого", "второго", "третьего", "четвертого"};

            System.out.println("Введите кординаты " + spelling[counter] + " однопалубного коробля (Формат: x,y)");

            counter++;

            try {
                String deckOne = scanner.nextLine();
                String[] decks = deckOne.split(",");

                int x = Integer.parseInt(decks[0]);
                int y = Integer.parseInt(decks[1]);

                if (gameField[x][y].equals("\uD83D\uDFE6") || gameField[x][y].equals(" \uD83D\uDEE5")) {
                    throw new IllegalArgumentException();
                }

                if (x > 9 && y > 9) {
                    throw new ArrayIndexOutOfBoundsException();
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
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                counter--;
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            } catch (IllegalArgumentException e) {
                counter--;
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, " +
                        "в которой не может быть других кораблей (ореол корабля)");
            }
        }
        // 0,0 5,5 9,9 4,6
        //TODO 🛥

    }

    public static void addDeckTwo() {
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
                int[] check = new int[4];
                int x, y;

                for (int i = 0; i < decks.length; i++) {
                    deckTwo = decks[i].split(",");
                    x = Integer.parseInt(deckTwo[0]);
                    y = Integer.parseInt(deckTwo[1]);
                    check[i] += x;
                    check[i + 2] += y;

                }
                // TODO The ship is placed on an empty space on the map
                if (gameField[check[0]][check[2]].equals("\uD83D\uDFE6") || gameField[check[0]][check[2]].equals(" \uD83D\uDEE5") ||
                        gameField[check[1]][check[3]].equals("\uD83D\uDFE6") || gameField[check[1]][check[3]].equals(" \uD83D\uDEE5")) {
                    throw new IllegalArgumentException();
                }

                if (check[1] == check[0] - 1 && check[3] == check[2]) {
                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
                } else if (check[1] == check[0] + 1 && check[3] == check[2]) {
                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
                } else if (check[3] == check[2] + 1 && check[0] == check[1]) {
                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
                } else if (check[3] == check[2] - 1 && check[0] == check[1]) {
                    gameField[check[0]][check[2]] = "\uD83D\uDEE5";
                    gameField[check[1]][check[3]] = "\uD83D\uDEE5";
                } else {
                    throw new ArithmeticException();
                }

                getOrealDeck(check[0], check[2], check[1], check[3]);
                printFilled();

            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                counter--;
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            } catch (IllegalArgumentException e) {
                counter--;
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, " +
                        "в которой не может быть других кораблей (ореол корабля)");
            } catch (ArithmeticException e) {
                counter--;
                System.out.println("несколько координат, разбросанных по карте - это невалидный корабль.");
            }
        }
        // 0,0 5,5 9,9 4,6
        //TODO 🛥
    }

    public static void getOrealDeck(int x, int y, int z, int c) {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (x == 0 && y == 0 && z == 1) {
                    gameField[x][y + 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                    gameField[x + 2][y + 1] = "\uD83D\uDFE6";
                    gameField[x + 2][y] = "\uD83D\uDFE6";
                } else if (x == 0 && y == 0 && z == 0) {
                    gameField[x + 1][y] = "\uD83D\uDFE6";
                    gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y + 2] = "\uD83D\uDFE6";
                    gameField[x][y + 2] = "\uD83D\uDFE6";
                } else if (x == 0 && y == 9 && c == 8) {
                    gameField[x][y - 2] = "\uD83D\uDFE6";
                    gameField[x + 1][y] = "\uD83D\uDFE6";
                    gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y - 2] = "\uD83D\uDFE6";
                } else if (x == 0 && y == 9 && z == 1) {
                    gameField[x][y - 1] = "\uD83D\uDFE6";
                    gameField[x + 2][y] = "\uD83D\uDFE6";
                    gameField[x + 2][y - 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                } else if (x == 9 && y == 9 && z == 9) {
                    gameField[x][y - 2] = "\uD83D\uDFE6";
                    gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y] = "\uD83D\uDFE6";
                    gameField[x - 1][y - 2] = "\uD83D\uDFE6";
                } else if (x == 9 && y == 9 && z == 8) {
                    gameField[x][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 2][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 2][y] = "\uD83D\uDFE6";
                } // ToDO Filled oreal
                else if (x == 0 && y == 9) {
                    gameField[x][y - 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y] = "\uD83D\uDFE6";
                    gameField[x + 1][y - 1] = "\uD83D\uDFE6";

                } else if (x == 0 && (y != 0 && y < 9)) {
                    gameField[x][y + 1] = "\uD83D\uDFE6";
                    gameField[x][y - 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y] = "\uD83D\uDFE6";
                    gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                } else if (x == 9 && (y != 0 && y < 9)) {
                    gameField[x][y + 1] = "\uD83D\uDFE6";
                    gameField[x][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y] = "\uD83D\uDFE6";
                    gameField[x - 1][y + 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                } else if (y == 0 && (x != 0 && x < 9)) {
                    gameField[x][y + 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y] = "\uD83D\uDFE6";
                    gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y] = "\uD83D\uDFE6";
                    gameField[x - 1][y + 1] = "\uD83D\uDFE6";
                } else if (y == 9 && (x != 0 && x < 9)) {
                    gameField[x][y - 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y] = "\uD83D\uDFE6";
                    gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y] = "\uD83D\uDFE6";
                    gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                } else if (((x != 0 && x < 9) && y != 0) || (x != 0 && (y != 0 && y < 9))) {
                    gameField[x][y + 2] = "\uD83D\uDFE6";
                    gameField[x][y - 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y] = "\uD83D\uDFE6";
                    gameField[x + 1][y + 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y] = "\uD83D\uDFE6";
                    gameField[x - 1][y + 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y + 2] = "\uD83D\uDFE6";
                    gameField[x + 1][y + 2] = "\uD83D\uDFE6";
                }
            }
        }
    }

    public static void getOrealSecondDeck(int x, int y) {
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
                    gameField[x][y - 1] = "\uD83D\uDFE6";
                    gameField[x + 1][y] = "\uD83D\uDFE6";
                    gameField[x + 1][y - 1] = "\uD83D\uDFE6";
                    gameField[x - 1][y] = "\uD83D\uDFE6";
                    gameField[x - 1][y - 1] = "\uD83D\uDFE6";
                }
            }
        }
    }
}
