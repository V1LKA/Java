package lab13;

import java.util.*;
import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Predicate<Integer> odd = n -> n % 2 != 0;

        list.stream()
                .filter(odd)
                .forEach(System.out::println);
    }
}