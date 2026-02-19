package lab5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Введите числа (0 для завершения):");

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Сумма: " + sum);
    }
}