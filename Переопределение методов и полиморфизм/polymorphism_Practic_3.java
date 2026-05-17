class Animal {
    void makeSound() {
        System.out.println("Издает звук...");
    }
}

class Dog extends Animal {
    // ОШИБКА: Мы случайно написали имя с маленькой буквы или опечатались
    // Без аннотации компилятор решит, что это просто НОВЫЙ метод класса Dog
    void makesound() {
        System.out.println("Гав!");
    }
}
