import java.util.Scanner;

// Interface
interface Shape {
    double area();
    double perimeter();
}

// Circle class
class Circle implements Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

// Triangle class
class Triangle implements Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    public double perimeter() {
        return a + b + c;
    }
}

// Main class
public class ShapesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter radius of circle: ");
            double r = Double.parseDouble(sc.nextLine());
            Shape circle = new Circle(r);
            System.out.println("Circle Area: " + circle.area());
            System.out.println("Circle Perimeter: " + circle.perimeter());

            System.out.print("\nEnter length and width of rectangle: ");
            double l = Double.parseDouble(sc.nextLine());
            double w = Double.parseDouble(sc.nextLine());
            Shape rectangle = new Rectangle(l, w);
            System.out.println("Rectangle Area: " + rectangle.area());
            System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

            System.out.print("\nEnter three sides of triangle: ");
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double c = Double.parseDouble(sc.nextLine());
            Shape triangle = new Triangle(a, b, c);
            System.out.println("Triangle Area: " + triangle.area());
            System.out.println("Triangle Perimeter: " + triangle.perimeter());

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

