abstract class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();
    abstract void displayProductDetails();
}

class Electronics extends Product {
    Electronics(String name, double price) { super(name, price); }
    double calculateDiscount() { return price * 0.10; } // 10% off
    void displayProductDetails() {
        System.out.println("Electronics: " + name + " | Price: ₹" + price +
                           " | Discount: ₹" + calculateDiscount());
    }
}

class Clothing extends Product {
    Clothing(String name, double price) { super(name, price); }
    double calculateDiscount() { return price * 0.20; } // 20% off
    void displayProductDetails() {
        System.out.println("Clothing: " + name + " | Price: ₹" + price +
                           " | Discount: ₹" + calculateDiscount());
    }
}

class Grocery extends Product {
    Grocery(String name, double price) { super(name, price); }
    double calculateDiscount() { return price * 0.05; } // 5% off
    void displayProductDetails() {
        System.out.println("Grocery: " + name + " | Price: ₹" + price +
                           " | Discount: ₹" + calculateDiscount());
    }
}

public class CartSystemDemo {
    public static void main(String[] args) {
        Product p;

        p = new Electronics("Laptop", 60000);
        p.displayProductDetails();

        p = new Clothing("Shirt", 1500);
        p.displayProductDetails();

        p = new Grocery("Rice", 1000);
        p.displayProductDetails();
    }
}

