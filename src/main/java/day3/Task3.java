package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 5) {
            double dividend = scanner.nextDouble();
            double divisor = scanner.nextDouble();

            counter++;

            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(dividend / divisor);
        }
    }
}
