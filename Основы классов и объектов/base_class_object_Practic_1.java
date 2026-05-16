// Общий интерфейс для всех фигур, у которых можно посчитать площадь
interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width, height;
    public Rectangle(int w, int h) { this.width = w; this.height = h; }
    public int getArea() { return width * height; }
}

class Square implements Shape {
    private int side;
    public Square(int side) { this.side = side; }
    public int getArea() { return side * side; }
}

// Теперь мы можем подставить любую фигуру, и getArea() сработает предсказуемо
public class base_class_object_Practic_1 {
    public static void printArea(Shape shape) {
        System.out.println("Площадь: " + shape.getArea());
    }
}
