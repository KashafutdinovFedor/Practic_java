public class class_shell_Practic_2 {
    public static void main(String[] args) {
        // 1. Автоупаковка (Autoboxing)
        Boolean b1 = true;

        // 2. Статические константы
        Boolean b2 = Boolean.TRUE;
        Boolean b3 = Boolean.FALSE;

        // 3. Статический метод valueOf()
        // Он эффективно использует память, возвращая кэшированные объекты.
        Boolean b4 = Boolean.valueOf(true);      // Из примитива
        Boolean b5 = Boolean.valueOf("true");    // Из строки (true)
        Boolean b6 = Boolean.valueOf("Maybe");   // Любая другая строка даст false

        // 4. Получение из системных свойств
        Boolean b7 = Boolean.getBoolean("myConfig");
    }
}
