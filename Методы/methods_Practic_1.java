// Родительский класс
class Animal {
    // 1. ПЕРЕГРУЗКА (Overloading)
    // Тот же метод, но с разными параметрами
    public void eat() {
        System.out.println("Животное ест какую-то еду.");
    }

    public void eat(String food) {
        System.out.println("Животное ест " + food + ".");
    }

    // Метод, который мы будем переопределять
    public void makeSound() {
        System.out.println("Животное издает неопределенный звук.");
    }
}

// Дочерний класс
class Dog extends Animal {
    // 2. ПЕРЕОПРЕДЕЛЕНИЕ (Overriding)
    // Меняем поведение метода родителя в дочернем классе
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав!");
    }

    // Еще один пример перегрузки уже в этом классе
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("Гав! ");
        }
        System.out.println();
    }
}

public class methods_Practic_1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println("--- Примеры перегрузки ---");
        myDog.eat();             // Вызов базовой версии
        myDog.eat("мясо");       // Вызов версии с параметром
        myDog.bark(3);           // Вызов метода с числом повторений

        System.out.println("\n--- Пример переопределения ---");
        // Вызовется метод из класса Dog, а не из Animal
        myDog.makeSound();
    }
}