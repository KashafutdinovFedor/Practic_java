import java.util.ArrayList;
import java.util.List;

public class parametr_class_Practic_1 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();

        System.out.println("--- Проверка instanceof с дженериками ---");

        // 1. Прямая проверка на конкретный тип дженерика запрещена
        // if (stringList instanceof ArrayList<String>) { } // Ошибка компиляции

        // 2. Проверка через неопределенный тип (wildcard)
        // Это подтверждает, что объект является списком ArrayList, независимо от типа внутри
        if (stringList instanceof ArrayList<?>) {
            System.out.println("1. stringList является экземпляром ArrayList.");
        }

        // 3. Проверка на базовый тип (Raw Type)
        if (intList instanceof List) {
            System.out.println("2. intList является экземпляром List.");
        }

        // 4. Демонстрация стирания типов
        // Оба списка для JVM выглядят как просто ArrayList на этапе выполнения
        System.out.println("3. Типы одинаковы? " + (stringList.getClass() == intList.getClass()));

        // 5. Использование с пользовательским классом
        Box<String> box = new Box<>("Привет");
        checkBox(box);
    }

    public static void checkBox(Object obj) {
        // Проверяем, является ли объект нашим параметризованным классом
        if (obj instanceof Box<?>) {
            System.out.println("4. Объект является коробкой (Box).");
        }
    }
}

// Пример параметризованного класса
class Box<T> {
    private T content;
    public Box(T content) { this.content = content; }
}
