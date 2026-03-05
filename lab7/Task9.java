package lab7;

import java.util.Random;

public class Task9 {

    public static void main(String[] args) {

        int[][] C = new int[5][5];
        int product = 1;

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                C[i][j] = rand.nextInt(21) - 10;
            }
        }

        for (int i = 0; i < 5; i++) {

            if (C[i][i] > 0) {
                product *= C[i][i];
            }
        }

        System.out.println("Произведение положительных элементов диагонали: " + product);
    }
}