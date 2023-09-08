package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> marks = new ArrayList<>();
        marks.add("BMW");
        marks.add("Lada");
        marks.add("Mercedes-Benz");
        marks.add("Volvo");
        marks.add("Nissan");
        System.out.println(marks);
        marks.add(2,"Mitsubishi");
        System.out.println(marks);
        marks.remove(0);
        System.out.println(marks);
    }
}
