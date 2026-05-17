interface MyInterface {

    // Неабстрактный метод (default метод)
    default void defaultMethod() {
        System.out.println("Вызов default метода из интерфейса.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Вызов static метода напрямую через интерфейс.");
    }
}

// Создаем класс, реализующий этот интерфейс
class MyClass implements MyInterface {
.
}


public class Main {
    public static void main(String[] args) {
        // Создаем объект класса
        MyClass myObject = new MyClass();

        System.out.println("--- Способы вызова методов ---");

        // Способ 1: Вызов неабстрактного (default) метода через экземпляр класса
        myObject.defaultMethod();

        // Способ 2: Вызов статического метода через имя интерфейса
        MyInterface.staticMethod();
    }
}