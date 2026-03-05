package lab7;

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {

        int[] C = new int[20];
        Random rand = new Random();

        int sum = 0;

        for (int i = 0; i < C.length; i++) {

            C[i] = rand.nextInt(50);
            sum += C[i];

        }

        double average = (double) sum / C.length;

        System.out.println("Среднее арифметическое: " + average);
    }
}