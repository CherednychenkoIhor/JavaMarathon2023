package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[100];
        int largestArrayElement;
        int smallestArrayElement;
        int countLastZeroElement = 0;
        int sumLastZeroElement = 0;
        int[] testMass = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10000);
        }

        largestArrayElement = mas[0];
        smallestArrayElement = mas[0];

        for (int arr : mas) {
            if (arr > largestArrayElement) {
                largestArrayElement = arr;
            } else if (arr < smallestArrayElement) {
                smallestArrayElement = arr;
            } else if (arr % 10 == 0 || arr % 100 == 0 || arr % 1000 == 0) {
                testMass[countLastZeroElement] = arr;
                sumLastZeroElement += arr;
                countLastZeroElement++;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Наибольший элемент массива: " + largestArrayElement);
        System.out.println("Наименьший элемент массива: " + smallestArrayElement);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countLastZeroElement);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumLastZeroElement);

        System.out.println(Arrays.toString(testMass));
    }
}
