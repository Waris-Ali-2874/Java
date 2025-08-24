class Employee {
    int id;
    String name;
    double salary;

    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        double hra = salary * 0.2;
        double da = salary * 0.1;
        double gross = salary + hra + da;
        System.out.println(id + " " + name + " Gross: " + gross);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "John", 20000);
        Employee e2 = new Employee(102, "Mary", 30000);
        e1.display();
        e2.display();
    }
}


