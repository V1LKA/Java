package lab7;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        int[] B = new int[15];
        int sum = 0;

        Random rand = new Random();

        System.out.println("Массив:");

        for (int i = 0; i < B.length; i++) {
            B[i] = rand.nextInt(21) - 10;
            System.out.print(B[i] + " ");

            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("\nСумма положительных элементов: " + sum);
    }
}