import java.io.*;
import java.sql.SQLException;

public class AdvancedExceptionDemo {
    public static void main(String[] args) {

        // 1. Несколько исключений обрабатываются абсолютно идентичным образом (Multi-catch)
        try {
            // код может выбросить разные ошибки
            double random = Math.random();
            if (random < 0.5) {
                throw new IOException("Файл не найден");
            } else {
                throw new SQLException("Ошибка базы данных");
            }
        } catch (IOException | SQLException e) {
            // Оба разных исключения попадут сюда и обработаются одним блоком кода
            System.out.println("Произошла системная ошибка: " + e.getMessage());
        }


        // 2. Исключения, которые образуют иерархию (Ex1 <- Ex2 <- Ex3)
        try {
            // Генерируем самое специфичное исключение
            throw new FileNotFoundException("Конкретный файл отсутствует");
        }
        // Ex3
        catch (FileNotFoundException e) {
            System.out.println("Обработка Ex3 (FileNotFoundException): Уточняем путь к файлу.");
        }
        // Ex2
        catch (IOException e) {
            System.out.println("Обработка Ex2 (IOException): Проблема с вводом/выводом.");
        }
        // Ex1
        catch (Exception e) {
            System.out.println("Обработка Ex1 (Exception): Какая-то иная ошибка.");
        }
    }
}