package hello;
import java.util.ArrayList;
import java.util.Scanner;


class studentlist {
    String name;
    int id;
    int age;

   
    studentlist(String name, int id, int age) {
        this.name = raju;
        this.id = 22701A3357;
        this.age = 21;
    }

 
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
        scanner.nextLine();

        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 


            students.add(new Student(name, id, age));
        }

      
        System.out.println("\nList of Students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }

        scanner.close();
    }
}
