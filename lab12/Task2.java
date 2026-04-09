package lab12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Верхний: " + input.toUpperCase());
        System.out.println("Нижний: " + input.toLowerCase());
    }
}
