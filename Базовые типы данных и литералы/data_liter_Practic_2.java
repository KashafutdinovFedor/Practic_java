public class data_liter_Practic_2 {
    public static void main(String[] args) {
        // Вариант 1: Через отдельные символы char
        char f = '\u0424';
        char yo = '\u0451';
        char d = '\u0434';
        char o = '\u043e';
        char r = '\u0440';

        System.out.println("" + f + yo + d + o + r);

        // Вариант 2: Сразу в строке (более компактно)
        String name = "\u0424\u0451\u0434\u043e\u0440";
        System.out.println("Имя в Unicode: " + name);
    }
}