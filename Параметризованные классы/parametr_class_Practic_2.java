import java.util.ArrayList;
import java.util.List;

public class parametr_class_Practic_2 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.1, 2.2);
        List<Number> numbers = new ArrayList<>();

        // 1. Пример использования <? extends T>
        System.out.println("Сумма чисел: " + sum(integers));
        System.out.println("Сумма дробных: " + sum(doubles));

        // 2. Пример использования <? super T>
        addNumbers(numbers);
        System.out.println("Список после добавления: " + numbers);
    }

    /**
     * Wildcard с верхней границей (Upper Bounded Wildcard)
     * Позволяет ЧИТАТЬ данные из списка. 
     * Мы знаем, что там точно Number или его наследники.
     */
    public static double sum(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }

    /**
     * Wildcard с нижней границей (Lower Bounded Wildcard)
     * Позволяет ЗАПИСЫВАТЬ данные в список.
     * Мы можем безопасно добавить Integer, так как список гарантированно 
     * является списком Integer или его предков (например, Number или Object).
     */
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}
//<? extends T> Используется, когда вам нужно только получать (читать) данные из структуры.
// Мы можем прочитать элемент и быть уверенным, что он приводится к типу T.

//<? super T> Используется, когда вам нужно записывать (добавлять) данные в структуру.