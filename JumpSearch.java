package chitra;
	import java.util.Scanner;

	public class JumpSearch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " sorted integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("Enter element to search: ");
	        int target = scanner.nextInt();
	        int index = jumpSearch(arr, target);
	        if (index == -1)
	            System.out.println("Element not found in the array.");
	        else
	            System.out.println("Element found at index: " + index);
	        scanner.close();
	    }

	    public static int jumpSearch(int[] arr, int target) {
	        int n = arr.length;
	        int step = (int) Math.floor(Math.sqrt(n));
	        int prev = 0;
	        while (arr[Math.min(step, n) - 1] < target) {
	            prev = step;
	            step += (int) Math.floor(Math.sqrt(n));
	            if (prev >= n)
	                return -1;
	        }
	        for (int i = prev; i < Math.min(step, n); i++) {
	            if (arr[i] == target)
	                return i;
	        }
	        return -1;
	    }
	}
