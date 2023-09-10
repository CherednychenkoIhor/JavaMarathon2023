package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList(File file) {
//        File file = new File("people.txt");
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] personName = line.split(" ");

                if (Integer.parseInt(personName[1]) < 0 ) {
                    throw new IllegalArgumentException();
                }

                Person person = new Person(personName[0], Integer.parseInt(personName[1]));

                people.add(person);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
