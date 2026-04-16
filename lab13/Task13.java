package lab13;

import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task13 {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
                new Person("Adlet", 17),
                new Person("Ali", 20),
                new Person("Dana", 18)
        );

        list.stream()
                .sorted(Comparator.comparing(p -> p.age))
                .forEach(p -> System.out.println(p.name + " " + p.age));
    }
}