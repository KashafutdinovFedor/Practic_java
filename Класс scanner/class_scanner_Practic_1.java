import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) {
        // Указываем путь к файлу
        File file = new File("data.txt");

        // Используем try-with-resources для автоматического закрытия сканера
        try (Scanner scanner = new Scanner(file)) {

            // Цикл выполняется, пока в файле есть следующая строка
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Прочитано: " + line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}