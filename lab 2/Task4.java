class Person {
    String name;
    int age;

    void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

class Student extends Person {
    String group;

    void showStudentInfo() {
        showInfo();
        System.out.println("Группа: " + group);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Адлет";
        student.age = 17;
        student.group = "IT-101";

        student.showStudentInfo();
    }
}