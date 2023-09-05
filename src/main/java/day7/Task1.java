package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2020,25, 244);
        Airplane airplane2 = new Airplane("TY", 1990,45, 100);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}