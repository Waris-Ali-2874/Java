class Calculator {
    int calculate(int n) {   // square
        return n * n;
    }
    int calculate(int a, int b) {  // product
        return a * b;
    }
    float calculate(float n) {  // cube
        return n * n * n;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Square: " + c.calculate(5));
        System.out.println("Product: " + c.calculate(3, 4));
        System.out.println("Cube: " + c.calculate(2.5f));
    }
}
