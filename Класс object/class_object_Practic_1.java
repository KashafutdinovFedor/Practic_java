import java.util.Objects;

class Smartphone {
    private String model;
    private String imei; // Уникальный идентификатор

    public Smartphone(String model, String imei) {
        this.model = model;
        this.imei = imei;
    }

    @Override
    public boolean equals(Object o) {
        // 1. Проверка на идентичность ссылок (самый быстрый путь)
        if (this == o) return true;

        // 2. Проверка на null и сравнение классов объектов
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Приведение типа и сравнение значимых полей
        Smartphone that = (Smartphone) o;
        return Objects.equals(imei, that.imei);
    }

    @Override
    public int hashCode() {
        // По контракту, если equals() возвращает true, 
        // то hashCode() этих объектов должны быть одинаковы.
        return Objects.hash(imei);
    }
}

//Согласно спецификации Java, реализация equals() должна обладать следующими свойствами:
//Рефлексивность: Объект должен быть равен самому себе. x.equals(x) всегда возвращает true.
//Симметричность: Если x.equals(y) возвращает true, то и y.equals(x) должно возвращать true.
//Транзитивность: Если x.equals(y) и y.equals(z) возвращают true, то и x.equals(z) должно вернуть true.
//Согласованность: Повторные вызовы метода при условии, что данные объекта не менялись,
//  должны возвращать один и тот же результат.

//Проверка на null: Вызов x.equals(null) всегда должен возвращать false, а не выбрасывать исключение.