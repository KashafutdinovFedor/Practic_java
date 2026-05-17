import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия потока
        try (InputStream input = new FileInputStream("test.txt")) {
            int data;

            // Читаем по одному байту в цикле, пока не получим -1
            while ((data = input.read()) != -1) {
                // Преобразуем полученный байт (int) обратно в символ (char)
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
