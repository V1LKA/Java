package lab13;

import java.util.*;

public class Task15 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        list.stream()
                .filter(n -> n % 2 == 0)     // только чётные
                .map(n -> n * 2)             // умножаем
                .sorted()                   // сортировка
                .forEach(System.out::println);
    }
}