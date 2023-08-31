package day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first date: ");
        int firstDate = scanner.nextInt();
        System.out.print("Enter last date: ");
        int lastDate = scanner.nextInt();
        for (int i = firstDate; i <= lastDate; i += 4) {
            System.out.println("Олимпиада " + i + " года");
        }
    }
}
