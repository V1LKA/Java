package lab7;

import java.util.Random;

public class Task7 {

    public static void main(String[] args) {

        int[][] B = new int[5][5];
        int[] A = new int[5];

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                B[i][j] = rand.nextInt(21) - 10;

                if (B[i][j] > 0) {
                    A[i] += B[i][j];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Сумма положительных элементов строки " + i + ": " + A[i]);
        }
    }
}