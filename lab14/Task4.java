package lab14;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "12345";
        String input;

        do {
            System.out.print("Введите пароль: ");
            input = scanner.nextLine();
        } while (!input.equals(correctPassword));

        System.out.println("Доступ разрешён!");
    }
}