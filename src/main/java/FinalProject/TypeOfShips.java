package FinalProject;

public enum TypeOfShips {
    SINGLE_DECK_SHIP(new Ships(1, 2));
    // TODO enum of type ships
    private int x;
    private int y;

    TypeOfShips(Ships ships) {
    }
}
