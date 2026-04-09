package lab12;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }
}