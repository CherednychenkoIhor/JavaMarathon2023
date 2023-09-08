package day11;

public class Courier implements Worker {
    private int salary;
    private final Warehouse warehouse;
    private int count;
    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() == 1000000) {
            count++;
        }
        if (count == 1) {
            salary *= 2;
        }
    }
}
