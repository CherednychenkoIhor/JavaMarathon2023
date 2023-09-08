package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 350; i++) {
            if (i < 30) {
                if (i % 2 == 0) {
                    numbers.add(i);
                }
            }  else if (i >= 300) {
                if (i % 2 == 0) {
                    numbers.add(i);
                }
            }
        }
        System.out.println(numbers);
    }
}
