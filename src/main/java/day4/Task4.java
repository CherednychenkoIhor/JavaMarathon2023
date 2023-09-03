package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[100];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(mas));
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < mas.length - 2; i++) {
            int sum = 0;
            for (int j = 0; j < i + 3; j++) {
                sum += mas[j];
            }
            if (sum > maxSum){
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIdx);
    }
}
