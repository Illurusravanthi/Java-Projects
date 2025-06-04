package hello;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        // Create a HashSet to store unique integers
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (type 'exit' to finish):");

        // Read user input
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                boolean isAdded = uniqueNumbers.add(number);
                if (!isAdded) {
                    System.out.println("Number " + number + " is already in the set and won't be added again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or type 'exit' to finish.");
            }
        }

        scanner.close();

        // Display the unique numbers
        System.out.println("\nUnique numbers entered:");
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }
    }
}


