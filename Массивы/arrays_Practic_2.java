import java.util.Arrays;

public class arrays_Practic_2 {
    public static void main(String[] args) {

        // Подготовим два массива для демонстрации
        int[] numbers = {10, 5, 20, 15, 0};
        int[] secondArray = {10, 5, 20, 15, 0};

        System.out.println("--- Работа с java.util.Arrays ---");

        // 1. Arrays.sort(...) — Сортировка массива (по возрастанию)
        //изменяет сам исходный массив
        Arrays.sort(numbers);

        // 2. Arrays.toString(...) — Преобразование в читаемую строку
        // Без этого метода при выводе мы бы увидели просто адрес в памяти
        System.out.println("1 & 2. Отсортированный массив: " + Arrays.toString(numbers));

        // 3. Arrays.binarySearch(...) — Бинарный поиск
        //Работает корректно ТОЛЬКО на отсортированном массиве!
        int target = 15;
        int index = Arrays.binarySearch(numbers, target);
        System.out.println("3. Индекс элемента " + target + " в массиве: " + index);

        // 4. Arrays.equals(...) — Проверка на равенство содержимого
        // Обычный оператор == сравнил бы ссылки (адреса), а не числа внутри
        boolean isEqual = Arrays.equals(numbers, secondArray);
        System.out.println("4. Массивы равны по содержимому? " + isEqual);

        // 5. Arrays.compare(...) — Лексикографическое сравнение
        // Возвращает 0, если массивы идентичны.
        // Положительное число, если первый "больше", отрицательное — если "меньше"
        int result = Arrays.compare(numbers, secondArray);
        System.out.println("5. Результат сравнения (compare): " + result);
    }
}
