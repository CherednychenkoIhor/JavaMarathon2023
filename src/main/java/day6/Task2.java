package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2020, 20, 10);
        airplane.setYear(1999);
        airplane.setLength(18);
        airplane.fillUp(1000);
        airplane.fillUp(1500);
        airplane.info();
    }
}
