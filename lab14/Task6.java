package lab14;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Выполнение операции...");
            System.out.print("Продолжить? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Программа завершена.");
    }
}