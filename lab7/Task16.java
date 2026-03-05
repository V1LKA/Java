package lab7;

import java.util.Random;

public class Task16 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        int max = findMax(arr);

        System.out.println("Максимальный элемент: " + max);
    }

    public static int findMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

        }

        return max;
    }
}
