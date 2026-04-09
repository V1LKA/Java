package lab12;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reversed)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}