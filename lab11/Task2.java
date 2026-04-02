package lab11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";

        System.out.println("--- Task 2: Calculator with Loop ---");

        while (!choice.equalsIgnoreCase("no")) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Operation (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            if (op == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (op == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (op == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (op == '/') {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
            } else {
                System.out.println("Invalid operation");
            }

            System.out.print("Continue? (yes/no): ");
            choice = scanner.next();
        }
        scanner.close();
    }
}