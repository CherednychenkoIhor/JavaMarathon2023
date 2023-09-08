package day11;

public class Picker extends Warehouse implements Worker {
    private int salary;
    private final Warehouse warehouse;
    private int count;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrders() == 1500) {
            count++;
        }
        if (count == 1) {
            salary = salary * 3;
        }
    }
}
