package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2022, "Red", "Kawasaki Ninja");
        System.out.println("Motorbike year manufacture: " + motorbike.getYear());
        System.out.println("Motorbike color: " + motorbike.getColor());
        System.out.println("Motorbike model: " + motorbike.getModel());
    }
}
