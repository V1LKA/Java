package lab12;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String word = sc.nextLine();

        if (text.contains(word)) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }
    }
}
