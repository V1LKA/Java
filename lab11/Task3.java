package lab11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Task 3: Methods ---");
        System.out.print("Введите число A: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число B: ");
        double b = scanner.nextDouble();

        System.out.println("Сумма: " + add(a, b));
        System.out.println("Разность: " + subtract(a, b));
        System.out.println("Произведение: " + multiply(a, b));
        System.out.println("Частное: " + divide(a, b));

        scanner.close();
    }

    // Методы для операций
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        return a / b;
    }
}