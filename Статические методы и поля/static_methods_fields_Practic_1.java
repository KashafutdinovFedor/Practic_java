public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("--- Вариант 1: Вызов через имя класса ---");
        A.printVars();

        System.out.println("\n--- Вариант 2: Вызов через экземпляр класса ---");
        // Создаем объект класса A
        A obj = new A();
        // Статические методы можно вызывать через объект, но компилятор выдаст предупреждение
        obj.printVars();

        System.out.println("\n--- Вариант 3: Вызов через null-ссылку ---");
        // Уникальная особенность статических методов: они работают даже с null,
        // так как обращение идет к типу класса, а не к объекту в памяти
        A nullObj = null;
        nullObj.printVars();
    }
}