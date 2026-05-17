class Animal {
    void makeSound() {
        System.out.println("Издает какой-то звук");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Мяу");
    }
}

//Если типы возвращаемых значений — это разные примитивы
//(например, один int, а другой double) или не связанные друг с другом классы,
//компилятор выдаст ошибку.

//Ковариантность типов (допустимое исключение)
//Начиная с Java 5, разрешено переопределять метод, если возвращаемый тип в подклассе является наследником возвращаемого типа из родительского класса.

//Пример

class Food {}
class Apple extends Food {}

class Parent {
    Food getFruit() { return new Food(); }
}

class Child extends Parent {
    @Override
    Apple getFruit() { // ОК! Apple — это подтип Food
        return new Apple();
    }
}