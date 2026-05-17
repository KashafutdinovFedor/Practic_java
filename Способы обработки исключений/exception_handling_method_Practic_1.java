public class ExceptionTerminationDemo {
    public static void main(String[] args) {

        System.out.println("--- Начало программы ---");

        // 1. ПЕРХВАЧЕННОЕ ИСКЛЮЧЕНИЕ
        try {
            System.out.println("Попытка деления на ноль...");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Программа заходит сюда, обрабатывает ошибку и НЕ ПАДАЕТ
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        System.out.println("Программа успешно продолжила работу после первого исключения.\n");

        // 2. ИСКЛЮЧЕНИЕ, ПРИВОДЯЩЕЕ К АВАРИЙНОЙ ОСТАНОВКЕ
        System.out.println("Сейчас возникнет ошибка, которая не будет перехвачена...");

        String str = null;
        // Это вызовет NullPointerException.
        // Так как здесь нет блока try-catch, программа прервется.
        int length = str.length();

        // Этот код уже никогда не выполнится
        System.out.println("Этот текст мы никогда не увидим в консоли.");
    }
}