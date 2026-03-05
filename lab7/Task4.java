package lab7;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        int[] C = new int[25];
        int product = 1;

        Random rand = new Random();

        System.out.println("Массив:");

        for (int i = 0; i < C.length; i++) {
            C[i] = rand.nextInt(21) - 10;
            System.out.print(C[i] + " ");

            if (C[i] > 0) {
                product *= C[i];
            }
        }

        System.out.println("\nПроизведение положительных элементов: " + product);
    }
}