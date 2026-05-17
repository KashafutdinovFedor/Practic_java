public class class_string_Practic_1 {
    public static void main(String[] args) {
        String str = "  Java is Amazing!  ";
        String empty = "";

        System.out.println("Исходная строка: [" + str + "]\n");

        // 1. length() — возвращает длину строки (количество символов)
        System.out.println("1. Длина строки: " + str.length());

        // 2. trim() — удаляет пробелы в начале и в конце строки
        String trimmed = str.trim();
        System.out.println("2. Без пробелов по краям: [" + trimmed + "]");

        // 3. toLowerCase() / toUpperCase() — меняет регистр всей строки
        System.out.println("3. В нижнем регистре: " + trimmed.toLowerCase());

        // 4. charAt(int index) — возвращает символ по указанному индексу (начиная с 0)
        System.out.println("4. Символ на позиции 5: " + trimmed.charAt(5));

        // 5. substring(int begin, int end) — извлекает подстроку из основной строки
        // Включает символ начала, но НЕ включает символ конца.
        System.out.println("5. Подстрока с 0 по 4 индекс: " + trimmed.substring(0, 4));

        // 6. contains(CharSequence s) — проверяет, содержит ли строка указанную последовательность символов
        System.out.println("6. Содержит слово 'Java'?: " + trimmed.contains("Java"));

        // 7. replace(old, new) — заменяет все вхождения старого символа или строки на новые
        System.out.println("7. Замена 'Amazing' на 'Cool': " + trimmed.replace("Amazing", "Cool"));

        // 8. startsWith(String prefix) / endsWith(String suffix) — проверка начала или конца строки
        System.out.println("8. Заканчивается на '!': " + trimmed.endsWith("!"));

        // 9. isEmpty() / isBlank() — проверка на пустоту
        // isEmpty() вернет true, если длина 0. isBlank() вернет true, если строка пуста или только из пробелов.
        System.out.println("9. Строка пустая?: " + empty.isEmpty());

        // 10. split(String regex) — разбивает строку на массив подстрок по заданному разделителю
        String[] words = trimmed.split(" ");
        System.out.print("10. Разделение по пробелу (первое слово): " + words[0]);
    }
}
