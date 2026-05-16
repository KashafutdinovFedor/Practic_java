public class operator_choice_Practic_1 {

    // Определяем Enum для примера
    enum Status { NEW, IN_PROGRESS, DONE }

    public static void main(String[] args) {

        // 1. Примитивные типы (byte, short, char, int)
        int day = 3;
        System.out.println("--- Примитив (int) ---");
        switch (day) {
            case 1: System.out.println("Понедельник"); break;
            case 3: System.out.println("Среда"); break;
            default: System.out.println("Другой день");
        }

        char grade = 'A';
        System.out.println("\n--- Примитив (char) ---");
        switch (grade) {
            case 'A': System.out.println("Отлично"); break;
            case 'B': System.out.println("Хорошо"); break;
        }

        // 2. Классы-обертки (Byte, Short, Character, Integer)
        Integer value = 10;
        System.out.println("\n--- Класс-обертка (Integer) ---");
        switch (value) {
            case 10: System.out.println("Значение равно десяти"); break;
            default: System.out.println("Другое значение");
        }

        // 3. Перечисления (Enum)
        Status currentStatus = Status.NEW;
        System.out.println("\n--- Перечисление (Enum) ---");
        switch (currentStatus) {
            case NEW: System.out.println("Статус: Новый заказ"); break;
            case DONE: System.out.println("Статус: Завершено"); break;
            default: System.out.println("Статус: В процессе");
        }

        // 4. Строки (String)
        String color = "Red";
        System.out.println("\n--- Строка (String) ---");
        switch (color) {
            case "Red": System.out.println("Цвет: Красный"); break;
            case "Green": System.out.println("Цвет: Зеленый"); break;
            default: System.out.println("Цвет не определен");
        }
    }
}
