package lab14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int sum = 0;

        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);

        System.out.println("Сумма цифр: " + sum);
    }
}