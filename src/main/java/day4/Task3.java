package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int[][] matrix = new int[m][n];
        int maxElem = 0;
        int stringIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sumMax = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
                sumMax += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
                if (sumMax > maxElem) {
                    maxElem = sumMax;
                    stringIndex = i;
                }
            System.out.println("   | Sum = " + sumMax);
        }

        System.out.println("\nMax sum = " + maxElem);
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + stringIndex);
    }
}
