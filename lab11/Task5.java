package lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();// Список для истории[span_11](end_span)

        while (true) {
            System.out.print("Введите пример (например, 2 + 2) или 'exit': ");
            String input = scanner.next();
            if (input.equals("exit")) break;

            double n1 = Double.parseDouble(input);
            String op = scanner.next();
            double n2 = scanner.nextDouble();
            double res = 0;

            if (op.equals("+")) res = n1 + n2;

            String entry = n1 + " " + op + " " + n2 + " = " + res;
            history.add(entry);// Сохраняем в историю[span_12](end_span)

                    System.out.println("Текущий результат: " + res);
            System.out.println("История: " + history);
        }
        scanner.close();
    }
}