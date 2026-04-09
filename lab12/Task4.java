package lab12;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.print(reversed + " ");
        }
    }
}