import java.util.InputMismatchException;
import java.util.Scanner;

// Interface for temperature conversion
interface TemperatureConverter {
    double celsiusToFahrenheit(double celsius);
    double fahrenheitToCelsius(double fahrenheit);
}

// Implementation class
class Converter implements TemperatureConverter {
    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

// Main class
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter converter = new Converter();

        try {
            System.out.print("Enter 1 for Celsius to Fahrenheit or 2 for Fahrenheit to Celsius: ");
            int choice = sc.nextInt();

            System.out.print("Enter temperature value: ");
            double value = sc.nextDouble();

            if (choice == 1) {
                System.out.println("Celsius to Fahrenheit: " + converter.celsiusToFahrenheit(value));
            } else if (choice == 2) {
                System.out.println("Fahrenheit to Celsius: " + converter.fahrenheitToCelsius(value));
            } else {
                System.out.println("Invalid choice!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value!");
        }
    }
}

