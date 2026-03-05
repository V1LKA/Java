package lab7;

import java.util.Random;

public class Task10 {

    public static void main(String[] args) {

        int[][] D = new int[7][7];

        Random rand = new Random();

        int sum = 0;

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                D[i][j] = rand.nextInt(21);
            }
        }

        for (int i = 0; i < 7; i++) {
            sum += D[i][i];
        }

        double average = (double) sum / 7;

        System.out.println("Среднее арифметическое диагонали: " + average);
    }
}