public class varargs_Practic_1 {
    // 1. Метод принимает любое количество целых чисел
    public void printInfo(int... numbers) {
        System.out.print("Метод с int... (количество: " + numbers.length + "): ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // 2. ПЕРЕГРУЗКА: метод с тем же именем, но другим типом varargs
    public void printInfo(String... words) {
        System.out.print("Метод с String... : ");
        for (String s : words) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // 3. ПЕРЕГРУЗКА: обязательный параметр + varargs
    public void printInfo(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varargs_Practic_1 demo = new varargs_Practic_1();

        demo.printInfo(1, 2, 3, 4, 5);          // Вызовется (1)
        demo.printInfo("Java", "is", "cool");  // Вызовется (2)
        demo.printInfo("Результат", 10, 20);   // Вызовется (3)
        demo.printInfo();                      // Вызовется (1) с пустым массивом
    }
}
