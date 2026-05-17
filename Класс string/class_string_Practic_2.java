import java.util.StringJoiner;

public class class_string_Practic_2 {
    public static void main(String[] args) {

        // 1. Конструктор с разделителем, префиксом и суффиксом
        // Синтаксис: new StringJoiner(delimiter, prefix, suffix)
        StringJoiner sj1 = new StringJoiner(", ", "Участники: [", "]");

        // 2. setEmptyValue() — что выводить, если в объект еще ничего не добавили
        // По умолчанию выводится prefix + suffix, но это можно переопределить
        sj1.setEmptyValue("Список пока пуст");
        System.out.println("До добавления: " + sj1.toString());

        // 3. add() — добавление элементов
        // Метод возвращает сам объект StringJoiner, поэтому можно использовать "цепочку" (chaining)
        sj1.add("Алиса").add("Боб").add("Виктор");

        // 4. length() — возвращает текущую длину строкового представления
        System.out.println("Текущая длина строки: " + sj1.length());
        System.out.println("После добавления: " + sj1.toString());

        // 5. Создаем второй объект для демонстрации слияния
        StringJoiner sj2 = new StringJoiner(" - ", "(", ")");
        sj2.add("Гость1").add("Гость2");

        // 6. merge() — слияние двух StringJoiner
        // ВАЖНО: Разделитель sj2 игнорируется, элементы sj2 добавляются
        // через разделитель основного объекта (sj1).
        // Но префикс и суффикс sj2 сохраняются внутри элементов!
        sj1.merge(sj2);

        // 7. toString() — финальный результат
        System.out.println("После merge: " + sj1.toString());

        // Еще раз проверим длину финальной строки
        System.out.println("Финальная длина: " + sj1.length());
    }
}
