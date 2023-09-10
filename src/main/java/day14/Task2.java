package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList(File file) {
//        File file = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0 )
                    throw new IllegalArgumentException();

                people.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return people;
    }
}
