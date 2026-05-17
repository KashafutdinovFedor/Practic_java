class SmartPhone {
    // Метод помечен как final
    final void bootSystem() {
        System.out.println("Загрузка защищенного ядра...");
    }
}

class CustomPhone extends SmartPhone {
    // Попытка переопределить final-метод приведет к ошибке
    @Override
    void bootSystem() {
        System.out.println("Загрузка кастомной прошивки...");
    }
}
