public class Main {
    public static void main(String[] args) {
        // 1. Создание экземпляра вложенного класса через имя интерфейса
        // Синтаксис: ИмяИнтерфейса.ВложенныйКласс
        Library.Book myBook = new Library.Book("Чистый код");

        // 2. Вызов метода вложенного класса
        myBook.read();
    }
}

// Определение интерфейса с вложенным классом
interface Library {
    void open();

    class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public void read() {
            System.out.println("Вы вызвали метод read() у книги: " + title);
        }
    }
}
