abstract class Payment {
    abstract void pay(double amount);
    abstract void validate();
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paying ₹" + amount + " using Credit Card.");
    }
    void validate() {
        System.out.println("Validating Credit Card details...");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paying ₹" + amount + " using UPI.");
    }
    void validate() {
        System.out.println("Validating UPI ID...");
    }
}

class WalletPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paying ₹" + amount + " using Wallet.");
    }
    void validate() {
        System.out.println("Checking Wallet balance...");
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.validate();
        p.pay(500);

        p = new UPIPayment();
        p.validate();
        p.pay(300);

        p = new WalletPayment();
        p.validate();
        p.pay(200);
    }
}

