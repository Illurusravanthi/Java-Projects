package chitra;
	import java.util.Arrays;
	import java.util.Scanner;

	public class BinarySearch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];

	        System.out.println("Enter " + n + " sorted integers:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();
	        int index = binarySearch(array, target);
	        if (index == -1) {
	            System.out.println("Element not found in the array.");
	        } else {
	            System.out.println("Element found at index: " + index);
	        }

	        scanner.close();
	    }
	    public static int binarySearch(int[] arr, int target) {
	        int low = 0, high = arr.length - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == target)
	                return mid;
	            else if (arr[mid] < target)
	                low = mid + 1;
	            else
	                high = mid - 1;
	        }

	        return -1;
	    }
	}


