package lab7;

import java.util.Random;

public class Task15 {

    public static void main(String[] args) {

        int[][] table = new int[3][5];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                table[i][j] = rand.nextInt(10);

                System.out.print(table[i][j] + " ");

            }

            System.out.println();
        }
    }
}