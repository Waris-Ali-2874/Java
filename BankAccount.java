class BankAccount {
    int accNo;
    String holder;
    double balance;

    BankAccount(int a, String h, double b) {
        accNo = a;
        holder = h;
        balance = b;
    }

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { if (amt <= balance) balance -= amt; }
    void display() { System.out.println(accNo + " " + holder + " Balance: " + balance); }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(1001, "Waris", 5000);
        b.display();
        b.deposit(2000);
        b.withdraw(3000);
        b.display();
    }
}

