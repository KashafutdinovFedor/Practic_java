public class data_liter_Practic_1 {
    public static void main(String[] args) {
        // Примитивы
        int age = 21;
        double pi = 3.14159;
        boolean isStudent = true;
        char grade = 'A';

        // Ссылочные типы (включая null примеры)
        String name = "Фёдор";
        String middleName = null; // Нулевое значение для строки

        Integer score = null; // Обертка над int, может быть null
        Double price = null;  // Обертка над double, может быть null

        // Вывод
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + middleName);
        System.out.println("Возраст: " + age);
        System.out.println("Баллы: " + score);
    }
}
