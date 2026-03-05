package lab7;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        int[] D = new int[17];
        double sum = 0;

        Random rand = new Random();

        System.out.println("Массив:");

        for (int i = 0; i < D.length; i++) {
            D[i] = rand.nextInt(21);
            System.out.print(D[i] + " ");
            sum += D[i];
        }

        double average = sum / D.length;

        System.out.println("\nСреднее арифметическое: " + average);
    }
}