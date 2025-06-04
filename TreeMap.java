package hello;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        // TreeMap for storing student marks
        TreeMap<String,Integer> studentMarks = new TreeMap<String,Integer>();

        // Adding some student marks
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);

        // Search for a student's marks
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name to search marks: ");
        String name = scanner.nextLine();

        if (studentMarks.containsKey(name)) {
            System.out.println(name + "'s marks: " + studentMarks.get(name));
        } else {
            System.out.println(name + " not found in records.");
        }

        // TreeMap as a simple phone book
        TreeMap<String, String> phoneBook = new TreeMap<String,Integer>();
        phoneBook.put("Alice", "9876543210");
        phoneBook.put("Bob", "9123456780");
        phoneBook.put("Charlie", "9012345678");

        // Displaying the phone book
        System.out.println("\nPhone Book:");
        for (String key : phoneBook.keySet()) {
            System.out.println(key + ": " + phoneBook.get(key));
        }

        scanner.close();
    }
}
