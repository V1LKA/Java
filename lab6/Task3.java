package lab6;

public class Task3 {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        System.out.println("Максимум (int): " + max(5, 9));
        System.out.println("Максимум (double): " + max(4.5, 2.3));
    }
}