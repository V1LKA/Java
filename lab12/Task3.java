package lab12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        System.out.println("Слов: " + words.length);
    }
}