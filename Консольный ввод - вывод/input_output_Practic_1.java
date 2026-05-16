import java.util.Scanner; // Импортируем инструмент для чтения ввода

public class input_output_Practic_1 {
    public static void main(String[] args) {
        // Создаем объект сканера, который "слушает" входной поток (System.in)
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");

        // Считываем строку, которую введет пользователь
        String name = sc.nextLine();

        // Выводим приветствие
        System.out.println("Привет, " + name);

        // Хорошим тоном считается закрывать сканер в конце
        sc.close();
    }
}
