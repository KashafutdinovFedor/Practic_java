public class cycles_Practic_2 {
    public static void main(String[] args) {

        System.out.println("Начинаем цикл от 1 до 10:");

        for (int i = 1; i <= 10; i++) {

            // 1. Пример с continue: пропускаем число 5
            if (i == 5) {
                System.out.println("Число 5 пропускаем через continue...");
                continue; // Переходим сразу к следующей итерации (к i = 6)
            }

            // 2. Пример с break: полностью выходим, если дошли до 8
            if (i == 8) {
                System.out.println("Дошли до 8, выходим из цикла через break!");
                break; // Цикл полностью прекращает работу
            }

            System.out.println("Текущее значение i: " + i);
        }

        System.out.println("Цикл завершен.");
    }
}
