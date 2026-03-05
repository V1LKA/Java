package lab7;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        int[] A = new int[20];
        int sum = 0;

        Random rand = new Random();

        System.out.println("Массив:");

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(21) - 10;
            System.out.print(A[i] + " ");

            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("\nСумма отрицательных элементов: " + sum);
    }
}
