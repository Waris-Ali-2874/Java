abstract class Employee {
    String name;
    Employee(String name) { this.name = name; }

    abstract double calculateSalary();
    abstract void generatePayslip();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() { return monthlySalary; }
    void generatePayslip() {
        System.out.println("Payslip: " + name + " | Salary: ₹" + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;
    PartTimeEmployee(String name, int hours, double rate) {
        super(name);
        this.hours = hours; this.rate = rate;
    }
    double calculateSalary() { return hours * rate; }
    void generatePayslip() {
        System.out.println("Payslip: " + name + " | Salary: ₹" + calculateSalary());
    }
}

class Intern extends Employee {
    double stipend;
    Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }
    double calculateSalary() { return stipend; }
    void generatePayslip() {
        System.out.println("Payslip: " + name + " | Stipend: ₹" + stipend);
    }
}

public class SalarySystemDemo {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee("Alice", 30000);
        e.generatePayslip();

        e = new PartTimeEmployee("Bob", 80, 200);
        e.generatePayslip();

        e = new Intern("Charlie", 5000);
        e.generatePayslip();
    }
}

