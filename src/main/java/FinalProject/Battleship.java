package FinalProject;

import java.io.IOException;
import java.util.Scanner;

public class Battleship {
    static Scanner scanner = new Scanner(System.in);
    static String player1;
    static String player2;


    static String[][] battlefield1 = new String[10][10];
    static String[][] battlefield2 = new String[10][10];

    static String[][] battle1 = new String[10][10];
    static String[][] battle2 = new String[10][10];

    public static void main(String[] args) throws IOException {
        GameField.filledField(battle1);
        GameField.filledField(battle2);

        System.out.print("Введите имя первого игрока: ");

        player1 = scanner.nextLine();

        System.out.println("Начнем расставлять корабли на поле " + player1 + ". Другой игрок, не смотри!");

        Ships.placeShips(battlefield1);

//        System.out.print("\033[H\033[J"); clear console!!!
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//        Runtime.getRuntime().exec("cls");
        for (int i = 0; i < 50; ++i) System.out.println();

        System.out.print("Введите имя второго игрока: ");

        player2 = scanner.nextLine();

        Ships.placeShips(battlefield2);

//        System.out.println("Начнем расставлять корабли на поле " + player2.getName() + ". Другой игрок, не смотри!");
        while (true) {
            makeTurn(player2, battle1, battlefield1);
            if (isWin())
                break;
            makeTurn(player1, battle2, battlefield2);
            if (isWin())
                break;
        }

        // TODO Attack and end of the game
//        System.out.println("Our battlefields");
//        GameField.printFilled(battlefield1);
//        GameField.printFilled(battlefield2);

    }

    public static void makeTurn(String playerName, String[][] battle, String[][] battlefield) {
        GameField.filledField(battle);
        GameField.printFilled(battle);
//        System.out.println("\uD83D\uDFE5");  // 🟥

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int countShips = 0;
        System.out.println(playerName + ", сделай свой ход (Формат: x,y)");
        while (true) {
            try {
                String makeTurn = scanner.nextLine();
                String[] decks = makeTurn.split(",");

                x = Integer.parseInt(decks[0]);
                y = Integer.parseInt(decks[1]);

                if (x > 9 && y > 9) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                if (battle[x][y].equals("\uD83D\uDFE5")) {
                    throw new IllegalArgumentException();
                }

                if (battlefield[x][y].equals("\uD83D\uDEE5")) {
                    battle[x][y] = "\uD83D\uDFE5";
                    GameField.printFilled(battle);
                    countShips++;
                    if (countShips == 4)
                        break;
                    System.out.println("Попадание! Сделай свой ход снова (Формат: x,y)");
                } else {
                    battle[x][y] = "\uD83D\uDFE6";
                    GameField.printFilled(battle);
                    System.out.println("Мимо! Право хода переходит вашему сопернику");
                    break;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Смотри формат ввода координат! (Формат: x,y)");
            } catch (IllegalArgumentException e) {
                System.out.println("Вы дважды попали в одно и то же место");
            }
        }
    }

    public static boolean isWin() {
        int counter1 = 0;
        for (String[] strings : battle1) {
            for (int j = 0; j < battle1.length; j++) {
                if (strings[j].equals("\uD83D\uDFE5"))
                    counter1++;
            }
        }

        int counter2 = 0;
        for (String[] strings : battle2) {
            for (int j = 0; j < battle2.length; j++) {
                if (strings[j].equals("\uD83D\uDFE5"))
                    counter2++;
            }
        }

        if (counter1 == 4) {
            System.out.println(player1 + " уничтожил все корабли противника!!!");
            return true;
        }
        if (counter2 == 4) {
            System.out.println(player2 + " уничтожил все корабли противника!!!");
            return true;
        }
        return false;
    }
}
//if (x < 9 && y < 9 && x > 0 && y > 0) {
//                        if (battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x][y + 1].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x + 1][y].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x][y - 1].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x - 1][y].equals("\uD83D\uDEE5")) {
//                            System.out.println("Утопил! Сделай свой ход снова (Формат: x,y)");
//                        } else if (battlefield[x][y].equals("\uD83D\uDEE5") && battlefield[x][y + 1].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && battlefield[x + 1][y].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && battlefield[x][y - 1].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && battlefield[x - 1][y].equals("\uD83D\uDEE5")) {
//                            System.out.println("Попадание! Сделай свой ход снова (Формат: x,y)");
//                        }
//                    } else if (x == 0 && y == 0) {
//                        if (battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x][y + 1].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x + 1][y].equals("\uD83D\uDEE5")) {
//                            System.out.println("Утопил! Сделай свой ход снова (Формат: x,y)");
//                        }
//                    } else if (x == 9 && y == 9) {
//                        if (battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x][y - 1].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x - 1][y].equals("\uD83D\uDEE5")) {
//                            System.out.println("Утопил! Сделай свой ход снова (Формат: x,y)");
//                        }
//                    } else if (x == 9 && y == 0) {
//                        if (battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x - 1][y].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x][y + 1].equals("\uD83D\uDEE5")) {
//                            System.out.println("Утопил! Сделай свой ход снова (Формат: x,y)");
//                        }
//                    } else if (x == 0 && y == 9) {
//                        if (battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x + 1][y].equals("\uD83D\uDEE5")
//                                || battlefield[x][y].equals("\uD83D\uDEE5") && !battlefield[x][y - 1].equals("\uD83D\uDEE5")) {
//                            System.out.println("Утопил! Сделай свой ход снова (Формат: x,y)");
//                        } else {
//                            System.out.println("Попадание! Сделай свой ход снова (Формат: x,y)");
//                        }
//                    }
