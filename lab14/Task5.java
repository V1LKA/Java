package lab14;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= number);

        System.out.println("Факториал: " + factorial);
    }
}
