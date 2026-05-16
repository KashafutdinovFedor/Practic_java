public class operators_Practic_2 {
    public static void main(String[] args) {
        // 1. Создаем объекты для проверки
        Animal myDog = new Dog();
        String text = "Java";
        String nullString = null;

        System.out.println("--- Результаты проверки instanceof ---");

        // 2. Базовая проверка (Объект и его класс)
        if (text instanceof String) {
            System.out.println("text является строкой: true");
        }

        // 3. Проверка иерархии (Наследование)
        // Dog является и Dog, и Animal, так как наследует его
        System.out.println("myDog это Dog? " + (myDog instanceof Dog));
        System.out.println("myDog это Animal? " + (myDog instanceof Animal));

        // 4. Случай с null-объектом
        // Результат всегда false, ошибка NullPointerException не возникает
        System.out.println("nullString (null) это String? " + (nullString instanceof String));
        System.out.println("null это Object? " + (null instanceof Object));

        // 5. Практическое применение: безопасное приведение типов
        if (myDog instanceof Dog) {
            Dog realDog = (Dog) myDog;
            realDog.bark();
        }
    }
}

// Вспомогательная иерархия классов
class Animal {}
class Dog extends Animal {
    void bark() {
        System.out.println("Гав!");
    }
}
