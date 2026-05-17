class Calculator {
    // 1. Метод принимает два целых числа
    int add(int a, int b) {
        return a + b;
    }

    // 2. ПЕРЕГРУЗКА: другое количество параметров
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. ПЕРЕГРУЗКА: другой тип параметров
    double add(double a, double b) {
        return a + b;
    }
}