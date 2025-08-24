
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double r = 5;
    void area() {
        System.out.println("Circle area = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l = 4, b = 6;
    void area() {
        System.out.println("Rectangle area = " + (l * b));
    }
}

class Triangle extends Shape {
    int base = 5, h = 8;
    void area() {
        System.out.println("Triangle area = " + (0.5 * base * h));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();

        s = new Triangle();
        s.area();
    }
}
