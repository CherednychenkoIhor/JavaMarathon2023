package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("test.txt"));
    }

    public static void printSumDigits(File file) {


        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numberString = line.split(" ");

            if (numberString.length != 10)
                throw new IllegalArgumentException();

            int sum = 0;

            for (String number : numberString) {
                sum += Integer.parseInt(number);
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
