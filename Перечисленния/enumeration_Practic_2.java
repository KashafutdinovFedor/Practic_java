public enum Operation {
    // Константы перечисления с инициализацией через конструктор
    PLUS("+"),
    MINUS("-"),
    TIMES("*"),
    DIVIDE("/");

    private final String symbol;

    // Конструктор перечисления
    Operation(String symbol) {
        this.symbol = symbol;
    }

    // Дополнительный метод для получения символа
    public String getSymbol() {
        return symbol;
    }

    // Дополнительный метод для выполнения операции
    public double apply(double x, double y) {
        return switch (this) {
            case PLUS   -> x + y;
            case MINUS  -> x - y;
            case TIMES  -> x * y;
            case DIVIDE -> x / y;
        };
    }
}

class Main {
    public static void main(String[] args) {
        double x = 10.0;
        double y = 5.0;

        System.out.println("--- Работа с собственным перечислением ---");

        for (Operation op : Operation.values()) {
            // Используем дополнительные методы getSymbol() и apply()
            System.out.printf("%.1f %s %.1f = %.1f%n",
                    x, op.getSymbol(), y, op.apply(x, y));
        }
    }
}