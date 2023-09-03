package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int[][] matrix = new int[m][n];
        int[] sumMax = new int[m];
        int maxElem;
        int stringIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
                sumMax[i] += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("    | Sum = " + sumMax[i]);
        }

        maxElem = sumMax[0];

        for (int i = 0; i < sumMax.length; i++) {
            if (sumMax[i] > maxElem){
                maxElem = sumMax[i];
            }
            if (sumMax[i] == maxElem) {
                stringIndex = i;
            }
        }

        System.out.println("\nMax sum = " + maxElem);
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + stringIndex);
    }
}
