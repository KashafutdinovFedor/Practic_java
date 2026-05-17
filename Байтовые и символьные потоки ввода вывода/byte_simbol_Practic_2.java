import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        // Коды ASCII для символов: J (74), a (97), v (118), a (97)
        int[] message = {74, 97, 118, 97};

        // Используем try-with-resources для надежного закрытия файла
        try (OutputStream output = new FileOutputStream("output.txt")) {

            for (int b : message) {
                // Записываем каждый байт по отдельности
                output.write(b);
            }

            System.out.println("Данные успешно записаны в файл.");

        } catch (IOException e) {
            System.err.println("Произошла ошибка при записи: " + e.getMessage());
        }
    }
}