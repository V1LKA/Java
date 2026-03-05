package lab7;

import java.util.Arrays;
import java.util.Random;

public class Task11 {

    public static void main(String[] args) {

        int[] A = new int[25];

        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100);
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < A.length; i++) {

            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }

            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
        }

        int temp = A[maxIndex];
        A[maxIndex] = A[minIndex];
        A[minIndex] = temp;

        System.out.println("Массив после обмена:");
        System.out.println(Arrays.toString(A));
    }
}