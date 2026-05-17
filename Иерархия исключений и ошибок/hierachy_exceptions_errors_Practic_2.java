public class ExceptionPracticum {
    public static void main(String[] args) {

        // 1. ArithmeticException — обычно деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("1. ArithmeticException: Деление на ноль недопустимо.");
        }

        // 2. ArrayIndexOutOfBoundsException — выход за пределы массива
        try {
            int[] array = {1, 2, 3};
            int value = array[10]; // Индекса 10 не существует
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("2. ArrayIndexOutOfBoundsException: Попытка доступа к несуществующему индексу.");
        }

        // 3. IllegalArgumentException — передача методу недопустимого аргумента
        try {
            printAge(-5); // Метод ниже выбрасывает исключение при отрицательном возрасте
        } catch (IllegalArgumentException e) {
            System.err.println("3. IllegalArgumentException: " + e.getMessage());
        }

        // 4. ClassCastException — неверное приведение типов
        try {
            Object obj = "Я строка";
            Integer num = (Integer) obj; // Нельзя превратить String в Integer
        } catch (ClassCastException e) {
            System.err.println("4. ClassCastException: Невозможно привести строку к числу.");
        }

        // 5. NullPointerException — обращение к методу или полю null-объекта
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.err.println("5. NullPointerException: Обращение к методу через null-ссылку.");
        }
    }

    // Вспомогательный метод для демонстрации IllegalArgumentException
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
        System.out.println("Возраст: " + age);
    }
}