package lab13;

interface Sum {
    int add(int a, int b);
}

public class Task1 {
    public static void main(String[] args) {

        Sum sum = (a, b) -> a + b;

        System.out.println(sum.add(5, 3));
    }
}