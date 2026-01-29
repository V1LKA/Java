public class Task3 {

    // Поле класса — доступно во всех методах этого класса
    int classVariable = 100;

    void showVariables() {
        // Локальная переменная — доступна только внутри этого метода
        int localVariable = 50;

        System.out.println("Поле класса: " + classVariable);
        System.out.println("Локальная переменная: " + localVariable);
    }

    public static void main(String[] args) {
        Task3 example = new Task3();
        example.showVariables();
    }
}