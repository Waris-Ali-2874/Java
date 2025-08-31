import java.util.Scanner;

// Interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// SavingsAccount class
class SavingsAccount implements BankAccount {
    private double balance;

    SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount(1000);

        try {
            System.out.println("Initial Balance: " + account.getBalance());

            System.out.print("Enter deposit amount: ");
            double dep = Double.parseDouble(sc.nextLine());
            account.deposit(dep);

            System.out.print("Enter withdrawal amount: ");
            double wd = Double.parseDouble(sc.nextLine());
            account.withdraw(wd);

            System.out.println("Final Balance: " + account.getBalance());

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
