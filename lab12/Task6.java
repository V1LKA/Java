package lab12;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();

        String result = text.replace(oldWord, newWord);

        System.out.println(result);
    }
}