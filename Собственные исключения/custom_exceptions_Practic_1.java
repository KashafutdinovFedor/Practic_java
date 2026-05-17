// 1. Создаем свой класс исключения
// Наследуемся от RuntimeException, чтобы его не нужно было обязательно ловить в try-catch
class InvalidAgeException extends RuntimeException {

    private int incorrectAge;

    public InvalidAgeException(String message, int age) {
        super(message); // Передаем текст ошибки в родительский класс
        this.incorrectAge = age;
    }

    public int getIncorrectAge() {
        return incorrectAge;
    }
}

// 2. Демонстрация использования
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge(15); // Попытка передать недопустимый возраст
        } catch (InvalidAgeException e) {
            // Обрабатываем наше собственное исключение
            System.err.println("Ошибка: " + e.getMessage());
            System.err.println("Введенный возраст: " + e.getIncorrectAge());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            // Генерируем наше исключение вручную
            throw new InvalidAgeException("Доступ запрещен: возраст должен быть 18+", age);
        }
        System.out.println("Доступ разрешен!");
    }
}