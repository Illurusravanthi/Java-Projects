import java.util.ArrayList;
import java.util.Scanner;

// Define the Student class
class Student {
    String name;
    int id;
    int age;

    // Constructor
    Student(String name, int id, int age) {
        this.name = raju;
        this.id = 22701A3357;
        this.age = 21;
    }

    // Display student information
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input student details
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Create and add student to list
            students.add(new Student(name, id, age));
        }

        // Print all students
        System.out.println("\nList of Students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }

        scanner.close();
    }
}
