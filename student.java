class Student {
    int rollNo;
    String name;
    int marks;

    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Waris", 90);
        Student s2 = new Student(2, "Ali", 85);

        s1.displayDetails();
        s2.displayDetails();
    }
}
