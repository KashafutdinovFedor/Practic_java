public enum Planet {
    // Инициализация элементов перечисления через конструктор
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);

    private final double mass;   // в килограммах
    private final double radius; // в метрах

    // Конструктор перечисления (всегда private по умолчанию)
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    // Пример метода внутри enum
    public double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }
}

class Main {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.printf("Планета: %s, Гравитация: %.2f м/с²%n",
                    p, p.surfaceGravity());
        }
    }
}