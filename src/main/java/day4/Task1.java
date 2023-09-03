package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sum = 0;
        int counterMoreThanEight = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int counterNumberOne = 0;
        int n = scanner.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }

        for (int arr : mas) {
            sum += arr;
            if (arr > 8) {
                counterMoreThanEight++;
            } else if (arr == 1) {
                counterNumberOne++;
            }
            if (arr % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }

        System.out.println(Arrays.toString(mas));
        System.out.println("Длина массива: " + mas.length);
        System.out.println("Количество чисел больше 8: " + counterMoreThanEight);
        System.out.println("Количество чисел равных 1: " + counterNumberOne);
        System.out.println("Количество четных чисел: " + counterEven);
        System.out.println("Количество нечетных чисел: " + counterOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
