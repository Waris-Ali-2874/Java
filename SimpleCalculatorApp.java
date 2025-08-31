import java.util.InputMismatchException;
import java.util.Scanner;

// Interface
interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b) throws ArithmeticException;
}

// Implementation class
class SimpleCalculator implements Calculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}

// Main class
public class SimpleCalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Addition: " + calc.add(num1, num2));
            System.out.println("Subtraction: " + calc.subtract(num1, num2));
            System.out.println("Multiplication: " + calc.multiply(num1, num2));
            
            try {
                System.out.println("Division: " + calc.divide(num1, num2));
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        }

        sc.close();
    }
}
