package day11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public int getCountOrders() {
        return countOrder;
    }

    public void setCountOrders(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse: " +
                "countOrder=" + countOrder +
                ", balance=" + balance;
    }
}
