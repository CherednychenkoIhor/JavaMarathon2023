package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mitsubishi");
        car.setColor("Blue");
        car.setYear(2006);
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car year manufacture: " + car.getYear());
    }
}
