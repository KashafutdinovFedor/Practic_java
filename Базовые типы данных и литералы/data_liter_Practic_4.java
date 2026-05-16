public class data_liter_Practic_4 {
    public static void main(String[] args) {
        String text = "Результат: ";
        int number = 10;
        boolean flag = true;
        Object obj = new Object();

        // Склеивание со строкой (конкатенация)
        System.out.println(text + number); // Результат: 10
        System.out.println(text + flag);   // Результат: true
        System.out.println(text + obj);    // Результат: java.lang.Object@...
    }
}