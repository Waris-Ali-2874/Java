import java.util.Scanner;

// Interface
interface Checkout {
    void processPayment(double amount);
}

// Implementation
class OnlineCart implements Checkout {
    public void processPayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment must be greater than zero!");
        }
        System.out.println("Payment of $" + amount + " processed successfully.");
    }
}

// Demo
public class OnlineCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OnlineCart cart = new OnlineCart();

        try {
            System.out.print("Enter payment amount: ");
            double amount = sc.nextDouble();
            cart.processPayment(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
