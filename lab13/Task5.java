package lab13;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,7,2,9);

        int max = list.stream().max(Integer::compare).get();

        System.out.println(max);
    }
}