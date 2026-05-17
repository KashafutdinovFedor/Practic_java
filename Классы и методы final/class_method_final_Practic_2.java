// Объявляем класс как final
final class SecuritySystem {
    void checkAccess() {
        System.out.println("Проверка доступа...");
    }
}

// Попытка наследоваться от final-класса вызовет ошибку
class MyHackSystem extends SecuritySystem {
    // ОШИБКА КОМПИЛЯЦИИ
}