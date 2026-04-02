package lab11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Task 4: Advanced Functions ---");
        System.out.println("1 - Возведение в степень (x^y)");
        System.out.println("2 - Квадратный корень");
        System.out.println("3 - Тригонометрия (Sin, Cos, Tan)");
        System.out.print("Выберите пункт меню: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Введите основание: ");
                double base = scanner.nextDouble();
                System.out.print("Введите степень: ");
                double exponent = scanner.nextDouble();
                System.out.println("Результат: " + Math.pow(base, exponent));
                break;
            case 2:
                System.out.print("Введите число: ");
                double num = scanner.nextDouble();
                if (num >= 0) {
                    System.out.println("Корень: " + Math.sqrt(num));
                } else {
                    System.out.println("Ошибка: корень из отрицательного числа!");
                }
                break;
            case 3:
                System.out.print("Введите угол в радианах: ");
                double angle = scanner.nextDouble();
                System.out.println("Sin: " + Math.sin(angle));
                System.out.println("Cos: " + Math.cos(angle));
                System.out.println("Tan: " + Math.tan(angle));
                break;
            default:
                System.out.println("Выбран неверный пункт.");
                break;
        }
        scanner.close();
    }
}