interface InterfaceA {
    default void show() {
        System.out.println("Реализация из InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Реализация из InterfaceB");
    }
}

// Если просто написать "implements InterfaceA, InterfaceB" без переопределения show(),
// код не скомпилируется.
class MyClass implements InterfaceA, InterfaceB {

    @Override
    public void show() {
        // Вариант 1: Мы можем вызвать реализацию конкретного интерфейса
        InterfaceA.super.show();

        // Вариант 2: Или вызвать другую
        // InterfaceB.super.show();

        // Вариант 3: Или написать полностью свою логику
        System.out.println("Собственная логика в MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}