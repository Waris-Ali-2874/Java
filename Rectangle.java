class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() { return length * breadth; }
    int perimeter() { return 2 * (length + breadth); }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
