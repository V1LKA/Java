class Person {
    void sayHello() {
        System.out.println("Привет, я человек");
    }
}

class Student extends Person {
    @Override
    void sayHello() {
        System.out.println("Привет, я студент");
    }
}

public class Task5 {
    public static void main(String[] args) {

        // Ссылка базового класса указывает на объект производного класса
        Person person = new Student();

        // Вызывается метод производного класса (полиморфизм)
        person.sayHello();
    }
}