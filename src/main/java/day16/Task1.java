package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("test.txt"));
    }

    public static void printResult (File file) {
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numberString = line.split(" ");

            double average = 0d;

            for (String averageString : numberString) {
                average += Double.parseDouble(averageString);
            }

            average /= numberString.length;

            System.out.printf(average + " --> %.3f", average);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
