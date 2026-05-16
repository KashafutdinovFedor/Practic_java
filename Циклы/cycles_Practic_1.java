public class cycles_Practic_1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("--- Демонстрация цикла while(true) ---");
        // 1. Тривиальный бесконечный цикл while
        while (true) {
            System.out.println("hi");
            // Заглушка для выхода, чтобы можно было увидеть второй пример
            if (true) break;
        }

        System.out.println("\n--- Демонстрация цикла do-while(true) ---");
        // 2. Тривиальный бесконечный цикл do-while
        do {
            System.out.println("Hello");
            if (true) break;
        } while (true);

        System.out.println("\nПрограмма завершена (использован break для примера).");
    }
}
