import java.util.Date;

public class FormatDemo {
    public static void main(String[] args) {
        // Данные для вывода
        String name = "Алексей";
        int age = 25;
        double salary = 1500.755;
        boolean isActive = true;
        Date now = new Date();

        // Форматированный вывод
        // %s - строка, %d - целое число, %.2f - дробное (с 2 знаками), 
        // %b - логическое значение, %tT - время, %n - новая строка
        System.out.printf("1. Имя пользователя: %s %n", name);
        System.out.printf("2. Возраст: %d лет %n", age);
        System.out.printf("3. Зарплата: %.2f USD %n", salary);
        System.out.printf("4. Статус активности: %b %n", isActive);
        System.out.printf("5. Текущее время: %tT %n", now);

    }
}