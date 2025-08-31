import java.util.InputMismatchException;
import java.util.Scanner;

// Interface
interface Grading {
    String calculateGrade(int marks);
}

// Implementation class
class Student implements Grading {
    private int marks;

    public Student(int marks) {
        this.marks = marks;
    }

    @Override
    public String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    public void displayGrade() {
        System.out.println("Student Grade: " + calculateGrade(marks));
    }
}

// Main class
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks (0-100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Must be between 0 and 100.");
            } else {
                Student s = new Student(marks);
                s.displayGrade();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric marks only.");
        }

        sc.close();
    }
}
