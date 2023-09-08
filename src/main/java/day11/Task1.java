package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        courier.doWork();
        warehouse.setBalance(1_000_000);
        courier.bonus();
        courier.bonus();
        System.out.println(courier.getSalary());
    }
}
