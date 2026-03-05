package lab7;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        double[] A = new double[12];
        double product = 1;

        Random rand = new Random();

        System.out.println("Массив:");

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextDouble() * 20 - 10;
            System.out.print(A[i] + " ");

            if (A[i] < 0) {
                product *= A[i];
            }
        }

        System.out.println("\nПроизведение отрицательных элементов: " + product);
    }
}