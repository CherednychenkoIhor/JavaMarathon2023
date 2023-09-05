package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
//        stamina = (int) Math.round( 90 + Math.random() * 10); // for random stamina [90, 100]
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > 0)
            stamina--;
        if (stamina == 0) {
            if (countPlayers > 0)
                countPlayers--;
            System.out.println("Игрок уходит с поля");
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
//        int freePlace = 6 - countPlayers; // * По желанию: доработать метод info() так,
                                            // чтобы при выводе в консоль грамматика русского языка учитывалась.
//        String grammarPlace = null;
//        switch (freePlace) {
//            case 1:
//               grammarPlace = " свободное место";
//               break;
//            case 2:
//            case 3:
//            case 4:
//               grammarPlace = " свободных места";
//             break;
//            case 5:
//                grammarPlace = " свободных мест";
//               break;
//        }
        if (countPlayers < 6) {
//            System.out.println("Команды неполные. На поле еще есть " + freePlace + grammarPlace);  // *
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
