package chitra;
	import java.util.Scanner;

	public class LinearSearchExample {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();
	        int index = linearSearch(array, target);
	        if (index == -1) {
	            System.out.println("Element not found in the array.");
	        } else {
	            System.out.println("Element found at index: " + index);
	        }

	        scanner.close();
	    }

	    public static int linearSearch(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target)
	                return i;
	        }
	        return -1;
	    }
	}
