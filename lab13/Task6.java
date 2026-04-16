package lab13;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "C");

        list.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);
    }
}