class Parent {
    String type = "Родитель";

    // 1. Конструктор суперкласса
    Parent(String name) {
        System.out.println("Создан " + name);
    }

    void show() {
        System.out.println("Метод в Parent");
    }
}

class Child extends Parent {
    String type = "Потомок";

    Child() {
        // 1. Обращение к конструктору суперкласса
        super("Объект Child");
    }

    void display() {
        // 2. Доступ к полю суперкласса
        System.out.println("Тип родителя: " + super.type);
        System.out.println("Тип текущий: " + this.type);

        // 3. Доступ к методу суперкласса
        super.show();
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}