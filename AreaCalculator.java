import java.util.Scanner;

class AreaCalculator {
    int area(int side) {  
        return side * side;
    }
    int area(int l, int b) {  
        return l * b;
    }
    double area(double r) {  
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        System.out.println("Square area: " + ac.area(s));

        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt(), b = sc.nextInt();
        System.out.println("Rectangle area: " + ac.area(l, b));

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Circle area: " + ac.area(r));
    }
}
