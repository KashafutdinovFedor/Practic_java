public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Исходная строка: " + sb);

        // 1. append() — добавляет текст в конец текущей строки
        sb.append(" is Awesome");
        System.out.println("1. append: " + sb);

        // 2. insert() — вставляет текст по указанному индексу
        sb.insert(4, " clearly");
        System.out.println("2. insert: " + sb);

        // 3. replace() — заменяет часть строки (от start до end) на новую
        sb.replace(5, 12, "really");
        System.out.println("3. replace: " + sb);

        // 4. delete() — удаляет символы в диапазоне индексов
        sb.delete(4, 11);
        System.out.println("4. delete: " + sb);

        // 5. deleteCharAt() — удаляет один конкретный символ
        sb.deleteCharAt(sb.length() - 1); // Удалим восклицательный знак, если бы он был
        System.out.println("5. deleteCharAt: " + sb);

        // 6. reverse() — переворачивает строку задом наперед
        sb.reverse();
        System.out.println("6. reverse: " + sb);
        sb.reverse(); // Вернем обратно для дальнейших тестов

        // 7. setCharAt() — заменяет символ по конкретному индексу
        sb.setCharAt(0, 'j');
        System.out.println("7. setCharAt: " + sb);

        // 8. substring() — извлекает часть строки (возвращает String)
        String sub = sb.substring(0, 4);
        System.out.println("8. substring(0,4): " + sub);

        // 9. capacity() — возвращает объем памяти, выделенный под буфер (не путать с length!)
        System.out.println("9. Текущая емкость (capacity): " + sb.capacity());

        // 10. setLength() — принудительно меняет длину строки
        // Если новая длина меньше — строка обрезается.
        sb.setLength(4);
        System.out.println("10. setLength(4): " + sb);
    }
}